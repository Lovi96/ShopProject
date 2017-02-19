package bolt;

import bolt.aruk.Elelmiszer;
import bolt.aruk.Sajt;
import bolt.aruk.Tej;

import java.io.File;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by Lovi on 2017. 02. 11. @ 21:30.
 */
public class Bolt implements Shop {

	public Bolt(String nev, String cim, String tulajdonos, Hashtable elelmiszerpult) {
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
		this.elelmiszerpult = elelmiszerpult;
	}

	public Bolt(String nev, String cim, String tulajdonos) {
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
	}

	private boolean nyitvaVan = true;
	private String nev;
	private String cim;
	private String tulajdonos;
	private Hashtable<Long, BoltBejegyzes> elelmiszerpult = new Hashtable<>();


	@Override
	public AruIterator aruk() {
		return new AruIterator();
	}

	public String getNev() {
		return nev;
	}

	public String getCim() {
		return cim;
	}

	public String getTulajdonos() {
		return tulajdonos;
	}

	@Override
	public void vasarol(Aru a, long mennyiseg) {

	}

	@Override
	public void nyit() {
	nyitvaVan = true;
	}

	@Override
	public void zar() {
	nyitvaVan = false;
	}

	@Override
	public File getLog() {
		return null;
	}

	public boolean vanMegTej() {
		return this.elelmiszerpult.containsKey(Tej.class);
	}

	public boolean vanMegSajt() {
		return this.elelmiszerpult.containsKey(Sajt.class);
	}

	private boolean vanMegAdottAru(Class c) {
		return this.elelmiszerpult.contains(c);
	}

	public void vasarolElelmiszert(Long vonalKod, long mennyiseg) {
		this.elelmiszerpult.remove(vonalKod, mennyiseg);
	}

	public void feltoltUjElelmiszerrel(Elelmiszer e, long mennyiseg, long ar) {
		//this.elelmiszerpult.put(e.getVonalKod(),mennyiseg);
		BoltBejegyzes bejegyzes = new BoltBejegyzes(e,mennyiseg,ar);
		Elelmiszer ujElelmiszer = bejegyzes.getE();
		long vonalKod = ujElelmiszer.getVonalKod();
		elelmiszerpult.put(vonalKod,bejegyzes);
	}

	public void feltoltElelmiszerrel(Long vonalKod, long mennyiseg) {
		BoltBejegyzes bejegyzes = elelmiszerpult.get(vonalKod);
		bejegyzes.adMennyiseg(mennyiseg);
	}

	public void torolElelmiszert(Long vonalKod) {
		this.elelmiszerpult.remove(vonalKod);
	}


	public class BoltBejegyzes {
		private Elelmiszer e;
		private long mennyiseg;
		private long ar;

		public BoltBejegyzes(Elelmiszer e, long mennyiseg, long ar) {
			this.e = e;
			this.mennyiseg = mennyiseg;
			this.ar = ar;
		}

		public Elelmiszer getE() {
			return e;
		}

		public void setE(Elelmiszer e) {
			this.e = e;
		}

		public long getMennyiseg() {
			return mennyiseg;
		}

		public void setMennyiseg(long mennyiseg) {
			this.mennyiseg = mennyiseg;
		}

		public void adMennyiseg(long mennyiseg) {
			this.mennyiseg = this.mennyiseg + mennyiseg;
		}

		public void levonMennyiseg(long mennyiseg) {
			this.mennyiseg = this.mennyiseg - mennyiseg;
		}

		public long getAr() {
			return ar;
		}

		public void setAr(int ar) {
			this.ar = ar;
		}
	}

	public class AruIterator implements Iterator {
		int indexNum = 0;
		Iterator i = null;

		public AruIterator(Iterator i) {
			this.i = i;
		}

		public AruIterator() {

		}

		@Override
		public boolean hasNext() {
			HashSet keyList = (HashSet) elelmiszerpult.keySet();
			return indexNum < keyList.size();
		}

		@Override
		public Object next() {
			Aru a = (Aru) i.next();
			indexNum++;
			return new Aru(a.getVonalKod(),a.getGyarto()){};
		}
	}
}

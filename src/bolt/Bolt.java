package bolt;

import bolt.aruk.Elelmiszer;
import bolt.aruk.Sajt;
import bolt.aruk.Tej;

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

	private String nev;
	private String cim;
	private String tulajdonos;
	private Hashtable<Long, Long> elelmiszerpult = new Hashtable<>();


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
		//TODO: figure out wtf is up with this.
	}

	public void feltoltElelmiszerrel(Long vonalKod, long mennyiseg) {
		if(this.elelmiszerpult.containsKey(vonalKod)) {
			this.elelmiszerpult.replace(vonalKod, this.elelmiszerpult.get(vonalKod),
					this.elelmiszerpult.get(vonalKod) + mennyiseg);
		} else this.elelmiszerpult.put(vonalKod, mennyiseg);
	}

	public void torolElelmiszert(Long vonalKod) {
		this.elelmiszerpult.remove(vonalKod);
	}


	public class BoltBejegyzes {
		private Tej t;
		private int mennyiseg;
		private int ar;

		public BoltBejegyzes(Tej t, int mennyiseg, int ar) {
			this.t = t;
			this.mennyiseg = mennyiseg;
			this.ar = ar;
		}

		public Tej getT() {
			return t;
		}

		public void setT(Tej t) {
			this.t = t;
		}

		public int getMennyiseg() {
			return mennyiseg;
		}

		public void setMennyiseg(int mennyiseg) {
			this.mennyiseg = mennyiseg;
		}

		public void adMennyiseg(int mennyiseg) {
			this.mennyiseg = this.mennyiseg + mennyiseg;
		}

		public void levonMennyiseg(int mennyiseg) {
			this.mennyiseg = this.mennyiseg - mennyiseg;
		}

		public int getAr() {
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
			HashSet keyList = (HashSet) elelmiszerpult.keySet();
			Long[] keyListAsArray = (Long[]) keyList.toArray();
			return keyListAsArray[indexNum++];
		}
	}
}

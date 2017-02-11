package bolt;

import java.util.Hashtable;

/**
 * Created by Lovi on 2017. 02. 11. @ 21:30.
 */
public class Elelmiszerbolt {

	public Elelmiszerbolt(String nev, String cim, String tulajdonos, Hashtable tejPult) {
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
		this.tejPult = tejPult;
	}
	public Elelmiszerbolt(String nev, String cim, String tulajdonos) {
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
	}

	private String nev;
	private String cim;
	private String tulajdonos;
	private Hashtable tejPult;

	public String getNev() {
		return nev;
	}

	public String getCim() {
		return cim;
	}

	public String getTulajdonos() {
		return tulajdonos;
	}
	public boolean vanMegTej(){
		return this.tejPult.size() > 0;
	}
	public Hashtable vasarolTej(long vonalKod){
		this.tejPult.remove(vonalKod);
		return this.tejPult;
	}
	public void feltoltTej(Tej t){
		this.tejPult.put(t.getVonalKod(),t);
	}
	public class BoltBejegyzes{
		private Tej t;
		private int mennyiseg;
		private int ar;

		public BoltBejegyzes(Tej t, int mennyiseg, int ar) {
			this.t = t;
			this.mennyiseg = mennyiseg;
			this.ar = ar;
		}
		public Tej getT(){
			return t;
		}
		public void setT(Tej t){
			this.t = t;
		}
		public int getMennyiseg(){
			return mennyiseg;
		}
		public void setMennyiseg(int mennyiseg){
			this.mennyiseg = mennyiseg;
		}
		public void adMennyiseg(int mennyiseg){
			this.mennyiseg = this.mennyiseg + mennyiseg;
		}
		public void levonMennyiseg(int mennyiseg){
			this.mennyiseg = this.mennyiseg - mennyiseg;
		}
		public int getAr(){
			return ar;
		}
		public void setAr(int ar){
			this.ar = ar;
		}
	}
}

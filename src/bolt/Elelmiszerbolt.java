package bolt;

import java.util.Vector;

/**
 * Created by Lovi on 2017. 02. 11. @ 21:30.
 */
public class Elelmiszerbolt {

	public Elelmiszerbolt(String nev, String cim, String tulajdonos, Vector<Tej> tejPult) {
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
	private Vector<Tej> tejPult;
	private int flag;

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
	public Vector<Tej> vasarolTej(Tej m){
		this.tejPult.remove(m);
		return this.tejPult;
	}
	public void feltoltTej(Tej m){
		this.tejPult.add(m);
	}
}

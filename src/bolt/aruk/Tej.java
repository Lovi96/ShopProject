package bolt.aruk;

import java.util.Date;

/**
 * Created by Lovi on 2017. 02. 11. @ 21:31.
 */
public abstract class Tej extends Elelmiszer{
	public final int LITER = 1;
	public final double FELLITER = 0.5;
	public final double POHAR = 0.25;
	public final double ZSIROS = 2.8;
	public final double FELZSIROS = 1.5;
	protected int urtartalom;
	protected double zsirtartalom;

	public Tej(Long vonalKod, String gyarto, Date szavatossagiIdo,int urtartalom,double zsirtartalom) {
		super(vonalKod, gyarto, szavatossagiIdo);
		this.urtartalom = urtartalom;
		this.zsirtartalom = zsirtartalom;
	}

	public int getUrtartalom() {
		return urtartalom;
	}

	public double getZsirtartalom() {
		return zsirtartalom;
	}

	public String toString() {
		return "Az " + this.getUrtartalom() + "liter űrtaralmú " + this.getGyarto() + " tej szavatossága " +
				this.getSzavatossagiIdo() + ", zsirtartalma" + this.getZsirtartalom() +
				" vonalkódja: " + this.getVonalKod();
	}
}

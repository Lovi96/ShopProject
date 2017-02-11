package bolt;

import java.util.Date;

/**
 * Created by Lovi on 2017. 02. 11. @ 21:31.
 */
public abstract class Tej {
	protected long vonalKod;
	private final int LITER = 1;
	private final double FELLITER = 0.5;
	private final double POHAR = 0.25;
	private final double ZSIROS = 2.8;
	private final double FELZSIROS = 1.5;
	protected int urtartalom;
	protected String gyarto;
	protected Date szavatossagiIdo;
	protected double zsirtartalom;

	public Tej(long vonalKod,int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom) {
		this.urtartalom = urtartalom;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
		this.zsirtartalom = zsirtartalom;
		this.vonalKod = vonalKod;
	}



	public int getUrtartalom() {
		return urtartalom;
	}

	public long getVonalKod() {
		return vonalKod;
	}

	public String getGyarto() {
		return gyarto;
	}

	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}

	public double getZsirtartalom() {
		return zsirtartalom;
	}

	public String toString() {
		return "Az " + this.getUrtartalom() + "liter űrtaralmú " + this.getGyarto() + " tej szavatossága " +
				this.getSzavatossagiIdo() + ", zsirtartalma" + this.getZsirtartalom() +
				" vonalkódja" + this.getVonalKod();
	}
}

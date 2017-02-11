package bolt;

import java.util.Date;

/**
 * Created by Lovi on 2017. 02. 11. @ 21:31.
 */
public class Tej {
	private long vonalKod;
	private final int LITER = 1;
	private final double FELLITER = 0.5;
	private final double POHAR = 0.25;
	private final double ZSIROS = 2.8;
	private final double FELZSIROS = 1.5;
	private int urtartalom;
	private String gyarto;
	private Date szavatossagiIdo;
	private double zsirtartalom;
	private long ar;

	public Tej(int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom, long ar) {
		this.urtartalom = urtartalom;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
		this.zsirtartalom = zsirtartalom;
		this.ar = ar;
	}

	public boolean joMeg() {
		Date jelenIdo = new Date();
		return !jelenIdo.after(this.getSzavatossagiIdo());
	}

	public int getUrtartalom() {
		return urtartalom;
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

	public long getAr() {
		return ar;
	}

	public String toString() {
		return "Az " + this.getUrtartalom() + "liter űrtaralmú " + this.getGyarto() + " tej szavatossága " +
				this.getSzavatossagiIdo() + ", zsirtartalma" + this.getZsirtartalom() + " ára pedig " + this.getAr();
	}
}

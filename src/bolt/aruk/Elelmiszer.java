package bolt.aruk;

import bolt.Aru;

import java.util.Date;

/**
 * Created by Lovi on 2017. 02. 12. @ 0:11.
 */
public abstract class Elelmiszer extends Aru {

	protected Date szavatossagiIdo;

	public Elelmiszer(Long vonalKod, String gyarto, Date szavatossagiIdo) {
		super(vonalKod, gyarto);
		this.szavatossagiIdo = szavatossagiIdo;
	}


	public Long getVonalKod() {
		return vonalKod;
	}

	public boolean joMeg() {
		Date jelenIdo = new Date();
		return !jelenIdo.after(this.getSzavatossagiIdo());
	}

	public String getGyarto() {
		return gyarto;
	}

	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}

	public String toString() {
		return "A(z) " + this.getGyarto() + " élelmiszer szavatossága " +
				this.getSzavatossagiIdo() + " vonalkódja" + this.getVonalKod();
	}

}

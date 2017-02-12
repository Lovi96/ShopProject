package bolt.aruk;


import java.util.Date;

/**
 * Created by Lovi on 2017. 02. 12. @ 13:30.
 */
public class Sajt extends Elelmiszer{

	protected double zsirtartalom;
	protected double suly;

	public Sajt(Long vonalKod, String gyarto, Date szavatossagiIdo,double suly,double zsirtartalom) {
		super(vonalKod, gyarto, szavatossagiIdo);
		this.suly = suly;
		this.zsirtartalom = zsirtartalom;
	}

}

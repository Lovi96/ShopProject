package bolt;

/**
 * Created by Lovi on 2017. 02. 12. @ 14:02.
 */
public abstract class Aru {
	public Aru(Long vonalKod, String gyarto) {
		this.vonalKod = vonalKod;
		this.gyarto = gyarto;
	}

	protected Long vonalKod;
	protected String gyarto;
}

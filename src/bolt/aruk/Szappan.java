package bolt.aruk;

import bolt.Aru;

/**
 * Created by Lovi on 2017. 02. 12. @ 14:03.
 */
public class Szappan extends Aru {
	protected char mosohatas;
	public Szappan(Long vonalKod, String gyarto, char mosohatas) {
		super(vonalKod, gyarto);
		this.mosohatas = mosohatas;
	}

}

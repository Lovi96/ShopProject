package bolt;

import java.util.Date;

/**
 * Created by Lovi on 2017. 02. 12. @ 18:15.
 */
public interface LogBejegyzes {

	Date getDatum();
	String getLogInfo();
	boolean isVasarlas();
	boolean isFeltoltes();
	boolean isAruTorles();
	boolean isAruListaLekeres();

}

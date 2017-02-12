package bolt;

import java.io.InputStream;
import java.util.Iterator;

/**
 * Created by Lovi on 2017. 02. 12. @ 18:15.
 */
public interface Log {
	InputStream getLogStream();
	Iterator getVasarlasok();
	Iterator getFeltoltesek();
	Iterator getAruTorlesek();
	Iterator getAruListaLekeresek();
	Iterator getTeljesNaplozas();
	LogBejegyzes[] getTeljeseNaplozasAsArray();
}

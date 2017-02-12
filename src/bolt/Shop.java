package bolt;

import java.io.File;
import java.util.Iterator;

/**
 * Created by Lovi on 2017. 02. 12. @ 17:30.
 */
public interface Shop {
    Iterator aruk();
	String getNev();
	String getCim();
	String getTulajdonos();
	void vasarol(Aru a,long mennyiseg);
	void nyit();
	void zar();
	File getLog();
}

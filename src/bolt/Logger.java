package bolt;


/**
 * Created by Lovi on 2017. 02. 12. @ 18:18.
 */
public interface Logger {
	public final int FELTOLTES = 0;
	public final int TORLES = 0;
	public final int VASARLAS = 0;
	public final int ARULISTALEKERES = 0;
	public void addVasarlas(String info);
	public void addAruTorles(String info);
	public void addAruFeltoltes(String info);
	public void addAruListaLekerdezes(String info);
	public void closeLogging();
}

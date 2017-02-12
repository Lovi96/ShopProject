package bolt;

import java.io.File;
import java.io.InputStream;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by Lovi on 2017. 02. 12. @ 18:23.
 */
public class BoltLogger implements Log, Logger {
	private Vector logs;
	private File f;
	public BoltLogger(){

	}

	@Override
	public InputStream getLogStream() {
		return null;
	}

	@Override
	public Iterator getVasarlasok() {
		return null;
	}

	@Override
	public Iterator getFeltoltesek() {
		return null;
	}

	@Override
	public Iterator getAruTorlesek() {
		return null;
	}

	@Override
	public Iterator getAruListaLekeresek() {
		return null;
	}

	@Override
	public Iterator getTeljesNaplozas() {
		return null;
	}

	@Override
	public LogBejegyzes[] getTeljeseNaplozasAsArray() {
		return new LogBejegyzes[0];
	}

	@Override
	public void addVasarlas(String info) {

	}

	@Override
	public void addAruTorles(String info) {

	}

	@Override
	public void addAruFeltoltes(String info) {

	}

	@Override
	public void addAruListaLekerdezes(String info) {

	}

	@Override
	public void closeLogging() {

	}
	public class BoltLogBejegyzes implements LogBejegyzes{
		public BoltLogBejegyzes(int code, Date datum, String logInfo) {
			this.code = code;
			this.datum = datum;
			this.logInfo = logInfo;
		}

		private int code;
		private Date datum;
		private String logInfo;

		@Override
		public Date getDatum() {
			return null;
		}

		@Override
		public String getLogInfo() {
			return null;
		}

		@Override
		public boolean isVasarlas() {
			return false;
		}

		@Override
		public boolean isFeltoltes() {
			return false;
		}

		@Override
		public boolean isAruTorles() {
			return false;
		}

		@Override
		public boolean isAruListaLekeres() {
			return false;
		}
	}
}

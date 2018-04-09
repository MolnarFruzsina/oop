package sajat;

public class gyermek extends Szemely {
	private String iskola;

	public gyermek(String nev, int kor, String iskola) {
		super(nev, kor);
		this.iskola = iskola;
	}

	@Override
	public String toString() {
		return "gyermek [iskola=" + iskola + ", toString()=" + super.toString() + "]";
	}

	public String getIskola() {
		return iskola;
	}

	

}

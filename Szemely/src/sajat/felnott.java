package sajat;

public class felnott extends Szemely {
	private String munkahely;

	public felnott(String nev, int kor, String munkahely) {
		super(nev, kor);
		this.munkahely = munkahely;
	}

	@Override
	public String toString() {
		return "felnott [munkahely=" + munkahely + ", toString()=" + super.toString() + "]";
	}

	public String getMunkahely() {
		return munkahely;
	} 
	

}

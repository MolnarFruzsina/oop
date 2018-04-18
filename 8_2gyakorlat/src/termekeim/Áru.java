package termekeim;

public class Áru {
	private String nev;
	private int ar;
	public Áru(String nev, int ar) {
		super();
		this.nev = nev;
		this.ar = ar;
	}
	@Override
	public String toString() {
		return "Áru [nev=" + nev + ", ar=" + ar + "]";
	}
	public int getAr() {
		return ar;
	}
	
	

}

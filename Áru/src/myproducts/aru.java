package myproducts;

public class aru {
	private String nev;
	private int ar;
	private int afakulcs;
	public aru(String nev, int ar, int afakulcs) {
		super();
		this.nev = nev;
		this.ar = ar;
		this.afakulcs = afakulcs;
	}
	
	public int bruttoar() {
		return (int) (ar * (1 + afakulcs/100.0));
	}

	@Override
	public String toString() {
		return "aru [nev=" + nev + ",bruttoar()=" + bruttoar() + "]";
	}
	
	public void netto_arat_novel (int szazalek) {
	    ar = (int)(ar * (1 + szazalek /100.00));
	}
	
	public int dragabbe(aru masik_aru) {
		if (bruttoar() > masik_aru.bruttoar()) {
			return 1;
		}	
		else if (bruttoar() < masik_aru.bruttoar()){
			return -1;
		}
		else {
			return 0;
		}
	}
	
	

}

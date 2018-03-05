import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class alkalmazott {
	private String nev; 
	private long fizetes;
	
	// getter
	public String getNev() {
		return nev;
	}

     // setter nev
	public void setNev(String nevparameter) {
		nev = nevparameter;
	}

      // getter fizetes
	public long getFizetes() {
		return fizetes;
	}

     // setter fizetes
	public void setFizetes(long fizetes) {
		this.fizetes = fizetes;
	}


	public void fizetesNovel(long ertek) {
		fizetes += ertek;
	}


	@Override
	public String toString() {
		return "alkalmazott neve: " + nev + ", fizetes :" + fizetes + " Ft";
	}
	
	public boolean fizetesIntervallumokKozott(long alsohatar, long felsohatar) {
		return fizetes >= alsohatar && fizetes <= felsohatar; 
		
	}
	
	public long fizetendoAdo() {
		return (long)(fizetes * 0.16);
		
	}

	public boolean nagyobbfizetesuMint(alkalmazott masik) {
		return fizetes > masik.fizetes;
	}
	

public long legnagyobbfizetesu() {
		return Math.max
		
		
	}
}

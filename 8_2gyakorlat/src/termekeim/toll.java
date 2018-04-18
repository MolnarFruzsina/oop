package termekeim;

import java.awt.Color;

import sajat.ISzinezheto;

public class toll extends Áru implements ISzinezheto {
	private Color szin;
	private String markanev;
	

	public toll(String nev, int ar, Color szin, String markanev) {
		super(nev, ar);
		this.szin = szin;
		this.markanev = markanev;
	}
	

	@Override
	public String toString() {
		return "toll [szin=" + szin + ", markanev=" + markanev + ", toString()=" + super.toString() + "]";
	}


	@Override
	public Color getszin() {
		return szin;
	}

	@Override
	public void setSzin(Color szin) {
		this.szin = szin; 

	}

}

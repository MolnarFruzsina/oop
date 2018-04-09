package myproducts;

public class Kenyer extends aru{
	private double mennyiseg ;

	public Kenyer(String nev, int ar, int afakulcs, double mennyiseg) {
		super(nev, ar, afakulcs);
		this.mennyiseg = mennyiseg;
	}

	@Override
	public String toString() {
		return "Kenyer [" + super.toString() + " , egysegar:" + bruttoar()/mennyiseg+ "]";
	}

	public double getMennyiseg() {
		return mennyiseg;
	} 
	
	public static boolean egysegar_nagyobb(Kenyer elso_kenyer, Kenyer masodik_kenyer) {
		if (elso_kenyer.bruttoar()/elso_kenyer.mennyiseg > masodik_kenyer.bruttoar()/masodik_kenyer.mennyiseg) {
			return true;
		}
		else return false;
	}
	

}

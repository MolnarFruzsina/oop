package tarolas;

public class tartalyos_Tartaly extends tartalyos_Tarolo {


	private double tartaly_nyomasa;
	public tartalyos_Tartaly(int terfogat, double tartaly_nyomasa) {
		super(terfogat);
		this.tartaly_nyomasa = tartaly_nyomasa;
	}
	@Override
	public boolean veszelyes_e() {
		if (tartaly_nyomasa > 100) {
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "tartalyos_Tartaly [tartaly_nyomasa=" + tartaly_nyomasa + ", veszelyes_e()=" + veszelyes_e()
				+ ", getTerfogat()=" + getTerfogat() + "]";
	}
	public boolean	nagyobb_nyomasu(tartalyos_Tartaly masiktarolo) {
		if (masiktarolo.tartaly_nyomasa > tartaly_nyomasa) {
			return false;
		}else return true; 
		
	}
	
	public static tartalyos_Tartaly nagyobb_terfogatu(tartalyos_Tartaly egyiktarolo, tartalyos_Tartaly masiktarolo) {
		if (egyiktarolo.getTerfogat() > masiktarolo.getTerfogat()) {
			return egyiktarolo;
		}else return masiktarolo;
		
	} 		


	}
	

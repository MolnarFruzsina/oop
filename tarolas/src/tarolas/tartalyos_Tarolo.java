package tarolas;

public abstract class tartalyos_Tarolo {
	private int terfogat;

	public tartalyos_Tarolo(int terfogat) {
		super();
		this.terfogat = terfogat;
	}
	
	public abstract boolean veszelyes_e();

	public int getTerfogat() {
		return terfogat;
	}
	

}

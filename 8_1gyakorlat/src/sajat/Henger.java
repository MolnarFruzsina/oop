package sajat;

public class Henger extends Hasab {
	private double sugar;

	public Henger(double magassag, double sugar) {
		super(magassag);
		this.sugar = sugar;
	}

	@Override
	public double getAlapterulet() {
		// TODO Auto-generated method stub
		return sugar * sugar * Math.PI;
	}

	@Override
	public String toString() {
		return "Henger [sugar=" + sugar + ", alapterulet()=" + getAlapterulet() + ", magassag()=" + getMagassag()
				+ ", terfogat()=" + getTerfogat() + "]";
	}

	

}

package sajat;

public class Teglatest extends Hasab {
	public Teglatest(double magassag) {
		super(magassag);
		// TODO Auto-generated constructor stub
	}
	
	private double a_oldal;
	private double b_oldal;
	public Teglatest(double magassag, double a_oldal, double b_oldal) {
		super(magassag);
		this.a_oldal = a_oldal;
		this.b_oldal = b_oldal;
	}
	@Override
	public double getAlapterulet() {
		// TODO Auto-generated method stub
		return a_oldal * b_oldal;
	}
	@Override
	public String toString() {
		return "Teglatest [a_oldal=" + a_oldal + ", b_oldal=" + b_oldal + ", getMagassag()=" + getMagassag() + "]";
	}

	

}

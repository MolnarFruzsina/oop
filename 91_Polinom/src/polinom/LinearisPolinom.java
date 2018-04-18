package polinom;

import matematika.Polinom;

public class LinearisPolinom implements Polinom {
	private double a;
	private double b; 

	
	public LinearisPolinom(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	
	@Override
	public String toString() {
		return "y="+ a +  "x" + (b<0 ? "" : "+") + b ;
	}

	@Override
	public int polinomFoka() {
		
		//return 1 ;
		if (a == 1) {
			return 0;
		} else {
			return 1;

		}
	}

	@Override
	public double szamol(double x) {
		//y=ax+b
		return a * x + b; 
	}

}

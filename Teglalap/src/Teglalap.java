
public class Teglalap {
	private int a_olda1;
	private int b_oldal;
	
	//konstruktor
	public Teglalap(int a_oldal, int b_oldal) {
		setOldalak(a_oldal , b_oldal);
	}
	//negyzetnel
	public Teglalap(int oldalhossz) {
		setOldalak(oldalhossz);
	}
	
	public int terulet () {
		return a_olda1 * b_oldal;
	}

	//Generate to String
	@Override
	public String toString() {
		return  a_olda1 + "," + b_oldal + ": " + terulet();
	}
	
	
	public void setOldalak (int a_oldal, int b_oldal) {
		this.a_olda1 = a_oldal;
		this.b_oldal = b_oldal;
	}
	
	public void setOldalak (int oldalhossz) {
		this.a_olda1 = oldalhossz;
		this.b_oldal = oldalhossz;
	}
	 public boolean teruletNagyobbMint(Teglalap masikTeglalap) {
		 return terulet() > masikTeglalap.terulet();
	 }
	 
	 public boolean egyezikE(Teglalap masikTeglalap) {
		 return a_olda1 == masikTeglalap.a_olda1 && b_oldal == masikTeglalap.b_oldal;
	}
		
	
	

}

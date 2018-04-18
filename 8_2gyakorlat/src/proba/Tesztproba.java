package proba;

import java.awt.Color;
import harmadik.Szinespont;
import sajat.ISzinezheto;
import termekeim.toll;

public class Tesztproba {

	public static void main(String[] args) {
		ISzinezheto szinespont = new Szinespont(Color.BLUE);
		
		System.out.println(szinespont);
		szinespont.setSzin(Color.GREEN);
		System.out.println(szinespont);
		//atszinez(szinespont);
		Tesztproba.atszinez(szinespont);
		System.out.println(szinespont);
		

		ISzinezheto toll = new toll("toll", 2000,Color.BLACK, "parker");
		System.out.println(toll);
		toll.setSzin(Color.CYAN);
		System.out.println(toll);
		atszinez(toll);
		
			
		}
		public static void  atszinez(ISzinezheto objektum){
			objektum.setSzin(objektum.alapertelmezettszin);
		
			
	}

}

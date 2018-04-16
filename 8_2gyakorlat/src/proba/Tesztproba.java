package proba;

import java.awt.Color;

import harmadik.Szinespont;
import sajat.ISzinezheto;

public class Tesztproba {

	public static void main(String[] args) {
		ISzinezheto szinespont = new Szinespont(Color.BLUE);
		System.out.println(szinespont);
		szinespont.setSzin(Color.GREEN);
		System.out.println(szinespont);
		atszinez(szinespont);
		System.out.println(szinespont);
		
			
		}
		public static void  atszinez(ISzinezheto objektum){
			objektum.setSzin(objektum.alapertelmezettszin);
		
	}

}

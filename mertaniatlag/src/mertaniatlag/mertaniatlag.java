package mertaniatlag;

import java.util.Random;
import java.util.Scanner;

public class mertaniatlag {
	public static void main(String[] args) {
		double tomb[] = new double [10];
		Scanner bemenet = new Scanner(System.in);
		
		for (int i = 0; i < tomb.length; i++) {
			System.out.println("Kerem adja meg az ertekeket");
		tomb[i] = bemenet.nextDouble();
			
		}
		
		double mertani_atlag = 1;
		for (int i = 0; i < tomb.length; i++) {
			mertani_atlag *= tomb[i];
			
		}
		
		mertani_atlag = Math.pow(mertani_atlag, 1.0 / tomb.length);
		System.out.println("mertani atlag");
		
		
		
		
		
		
	}
}

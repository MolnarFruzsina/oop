package polinom;

import java.util.Scanner;

import matematika.Polinom;

public class Teszt {
	public static void fvTablazat(Polinom polinom) {
		
		System.out.println("x\ty");
		for (double i = 0; i <= 1; i+= 0.1) {
			System.out.print(i + "\t");
			System.out.println(polinom.szamol(i));
		}
	}

	public static void main(String[] args) {
		LinearisPolinom egyenesegyenlete = new LinearisPolinom(2, -3);
		
		System.out.println(egyenesegyenlete);
		
		int polinomokszama = 5;
		LinearisPolinom[] tomb = new LinearisPolinom[polinomokszama];
		double a,b;
		Scanner beolvas = new Scanner(System.in);
		for (int i = 0; i < tomb.length; i++) {
			System.out.println("Kerem az a együtthatot");
			a = beolvas.nextDouble();
			beolvas.nextLine();
			System.out.println("Kerem a b együtthatot");
			b = beolvas.nextDouble();
			beolvas.nextLine();
			tomb[i] = new LinearisPolinom(a, b);
		}
		for (int i = 0; i < tomb.length; i++) {

			System.out.println(tomb[i]);
			
		}
			beolvas.close();
			
			fvTablazat(tomb[polinomokszama -1]);
			
	}
		
		
		
	}



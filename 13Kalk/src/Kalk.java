
import java.util.Scanner;

public class Kalk {

	public static void main(String[] args) {
	      Scanner bemenet = new Scanner(System.in);
	      System.out.println("Kerem az elso operandus erteket! ");
	      double elso_operandus =  bemenet.nextDouble();
	      
	      
	      System.out.println("Kerem a masodik operandus erteket! ");
	      double masodik_operandus =  bemenet.nextDouble();
	      
	      
	      System.out.println("Kerem az operatort! ");
	      String operator = bemenet.nextLine();
	     
	   double eredmeny;
	switch (operator) {
		case "+": eredmeny = elso_operandus + masodik_operandus;
			
			break;
		case "-": eredmeny = elso_operandus - masodik_operandus;
		    
		    break;
		case "/": eredmeny = elso_operandus / masodik_operandus;
		    
		    break;
        default: eredmeny = elso_operandus * masodik_operandus;
			break;
		} 
	      
	      System.out.println("az erdemeny:");
	      
	      System.out.println("Kerem adja meg a kiszamitando kifejezest! ");
	      System.out.println("a kifejezes:");
	      String kifejezes = bemenet.nextLine(); //space
	      
	      String [] tomb = kifejezes.split(" ");
	      elso_operandus = Double.parseDouble(tomb[0]);
	      masodik_operandus = Double.parseDouble(tomb[2]);
	      
	      System.out.println(tomb[0]);
	      System.out.println(tomb[1]);
	      System.out.println(tomb[2]);
	      
	    		  
	      
	      
	      
	   
	      bemenet.close();

	}

}

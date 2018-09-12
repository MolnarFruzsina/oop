package szoftvertech;
import java.util.Scanner;

public class Futtathato {

	public static void main(String[] args) {
		Auto[] autos = new Auto [2];
		Scanner scanner = new Scanner(System.in);
		int actualYear = java.time.LocalDate.now().getYear();
		String manufacturer;
		String model;
		int dateOfCreation;
		String engineType;
		
		System.out.println("Please enter the data (4 parameter)of the first car:");
		System.out.println("Please enter the name of the manufacturer!");
		manufacturer = scanner.next();
		System.out.println("Please enter the name of the model");
		model = scanner.next();
		do {
			System.out.println("Please enter the year the car was manufactured on!");
			dateOfCreation = scanner.nextInt();
			
		} while (dateOfCreation > actualYear || dateOfCreation < actualYear - 20);
		
		System.out.println("Please enter the capacity of the engine!");
		engineType = scanner.next();
		autos[0] = new Auto(dateOfCreation, model, manufacturer, engineType);
		System.out.println(autos[0]);
		
		}
	     

}

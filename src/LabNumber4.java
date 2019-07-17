import java.util.Scanner;

public class LabNumber4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter an integer above 0, User!");

		char userChar = 'y';
		
		int counter = 1;
		int userInt = scan.nextInt();
		
		//System.out.println("Number" + "      " + "Squared" + "      " + "Cubed");
		
		//System.out.println("========" + "   " + "========" + "   " + "========");
		
		do {
			
			System.out.println("Number" + "      " + "Squared" + "      " + "Cubed");
			
			System.out.println("========" + "   " + "========" + "   " + "========");
			do {

				

				System.out.println(counter + "           " + counter * counter + "          " + counter * counter * counter);

				counter++;

				
			} while (counter <= userInt);
			
			System.out.println("Would you like to continue? (y/n)");
				userChar = scan.next().charAt(0);
				
			
			if (userChar == 'y') {
					
					counter = 1;
					
					System.out.println("Please enter your next number.");
					userInt = scan.nextInt();
				}
				
		} while (userChar == 'y');
			
		System.out.println("Cheers! (aka cya)");	


		
			
		}
	}


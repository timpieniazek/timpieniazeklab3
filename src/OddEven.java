import java.util.Scanner;

public class OddEven {
	
// Tim Pieniazek - Lab 3

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String name;
		int i;
		String again;
		System.out.print("Greetings! What is your name? ");
		name = scnr.nextLine();
		System.out.printf("%nHello, %s!%n", name);
		
		do {
			do {
				System.out.printf("%nPlease enter an number between 1 and 100: ");
				while (!scnr.hasNextInt()) {
					System.out.printf("Error!%nPlease enter a valid integer, %s: ", name);
					scnr.nextLine();
				}
				i = scnr.nextInt();
				scnr.hasNextLine();
				if (i < 1) {
					System.out.println("Number too low!");
				} else if (i > 100) {
					System.out.println("Number too high!");
				}
			} while (i < 1 || i > 100);
			
			if (i % 2 == 1) {
				if (i > 60) {
					System.out.printf("%s, Odd and over 60.%n", i);
				} else {
					System.out.printf("%s, Odd.%n", i);
				}
			} else if (i < 25) {
				System.out.println("Even and less than 25.");
			} else if (i > 60) {
				System.out.printf("%s, Even.%n", i);
			} else {
				System.out.println("Even.");
			}
			
			System.out.printf("%n%s, would you like to automate decisions again (y/n)? ", name);
			again = scnr.next();
		} while (again.equalsIgnoreCase("y"));
		
		System.out.printf("%nThank you, %s.%nGoodBye!", name);

	}

}

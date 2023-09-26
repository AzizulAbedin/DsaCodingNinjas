package DsaCodingNinjas;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        // Create a new Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Please enter a string: ");

        // Read the user's input (a string) and store it in the 'str' variable
        String str = scan.next();

        // Display a welcome message along with the user's input
        System.out.println("Welcome to write your first code in Java: " + str);

        // Close the scanner to release system resources
        scan.close();
		 
		// without taking input
//    System.out.println("HelloWorld");
	}

}

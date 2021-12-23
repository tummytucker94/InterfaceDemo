package demoInterface;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//creates the Sscanner object
		Scanner scanner = new Scanner(System.in);
		
		//creates the Add object
		Add add = new Add();
		
		//creates the Subtract object
		Subtract subtract = new Subtract();
		
		System.out.println("Enter the first addend: ");
		
		//takes in user input and sets the Add objects's addendOne attribute to the input.
		int numOne = scanner.nextInt();
		add.setAddendOne(numOne);
		
		System.out.println("Enter second addend: ");
		
		//takes in the user input and sets the Add object's addendTwo attribute to the input.
		int numTwo = scanner.nextInt();
		add.setAddendTwo(numTwo);
		
		//calls Add object's getSum method to get the sum of the input from addendOne and addendTwo
		int additionAnswer = add.getSum();
		System.out.println(additionAnswer);
		
		//set the Subtract object's minuend attribute to the sum of the Add object.
		subtract.setMinuend(additionAnswer);
		
		//sets the value of "minu" to call the getMinuend() method of the Subtract object.
		int minu = subtract.getMinuend();
		
		//sets the value of the subtrahend attribute to the input given by the user.
		System.out.println("Enter the subtrahend: ");
		int s = scanner.nextInt();
		subtract.setSubtrahend(s);
		
		//set the value of "diff" to call the getDifference() method of the Subtract object.
		int diff = subtract.getDifference(minu, s);
		
		//displays the results
		System.out.println("The difference is: " + diff);
		
		//closes the scanner.
		scanner.close();

		
	}

}

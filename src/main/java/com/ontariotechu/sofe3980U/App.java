package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	/**
	 * Main program: The entry point of the program. The local time will be printed
	 * first,
	 * Then it will create two binary variables, add them and print the result.
	 *
	 * @param args: not used
	 */
	public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		String b1, b2;

		System.out.println("What would you like the first Binary number to be? (1's and 0's) ");
		b1 = scanner.nextLine();
		System.out.println("\nWhat would you like the Second Binary number to be? (1's and 0's) ");
		b2 = scanner2.nextLine();

		Binary binary1 = new Binary(b1);
		Binary binary2 = new Binary(b2);
		System.out.println("\nFirst binary number is " + binary1.getValue());
		System.out.println("\nSecond binary number is " + binary2.getValue());
		Binary sum = Binary.add(binary1, binary2);
		Binary OR = Binary.or(binary1, binary2);
		Binary AND = Binary.and(binary1, binary2);
		Binary MULTI = Binary.multiply(binary1, binary2);

		System.out.println("\nTheir summation is " + sum.getValue());
		System.out.println("The OR of the two binary numbers is: " + OR.getValue());
		System.out.println("The AND of the two binary numbers is: " + AND.getValue());
		System.out.println("Their multiplication is: " + MULTI.getValue());

	}
}
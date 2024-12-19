package javadatatypes;

import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter two values");
		
		int a= in.nextInt();
		
		int b= in.nextInt();
		
		System.out.println("Summation Result: "+(a+b));
		
		System.out.println("Subtraction Result: "+(a-b));
		
		System.out.println("Multiplication Result: "+(a*b));
		
		System.out.println("Division Result: "+(a/b));

	}

}

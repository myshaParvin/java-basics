package javadatatypes;

import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		
		Scanner data= new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		
		String name1= data.next();
		
		System.out.println("Your name is  "+name1);
		
		Scanner data1= new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		
		String name2= data1.nextLine();
		
		System.out.println("Your Full name is  "+name2);
		
	}

}

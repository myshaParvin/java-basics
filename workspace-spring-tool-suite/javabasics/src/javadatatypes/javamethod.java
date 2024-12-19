package javadatatypes;

import java.util.Scanner;

public class javamethod {

	public static void main(String[] args) {
		show();
		year();
	}
	
	public static void show() {
		
		String name="Mysha";
		System.out.println(name);
	}
	
	public static void year() {
		Scanner take= new Scanner(System.in);
		
		System.out.println("Enter a valid year_");
		
		int year=take.nextInt();
		
		System.out.println("This is your chosen year: "+year);
	}

}

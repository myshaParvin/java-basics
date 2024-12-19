package javadatatypes;

import java.util.Scanner;

public class forloop {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter two values");
		
		float a= in.nextFloat();
		
		
		for(float i=0;i<a;i++) {
			System.out.println(i);
		}

	}

}

package javadatatypes;

import java.util.Scanner;

public class ifcondition {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter two values");
		
		int a= in.nextInt();
		
		int b= in.nextInt();
		
		if(a>b){
		
			System.out.println("Here a is greater than b. So the Division Result will be: "+(a/b));
			
		}else if(b>a) {
			
			System.out.println("Here b is greater than a. So the Division Result will be: "+(b/a));
			
		}else if(a==b){
			
			System.out.println("Here a is equal to b. So the Division Result will be:"+(a/b));
			
		}else{
			
			System.out.println("Division is not Possible, Something is wrong!");
		}

	}

}

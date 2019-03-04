package exercises;

import java.util.Scanner;

public class FailPass {
	
	public static Scanner scan;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your marks");
	
     double mark= scan.nextDouble();
     
     if (mark>60) {
    	 System.out.println("You have passed the exam!");
     }
     else {
    	 System.out.println("You have failed!");
     }
	}

}

package exercises;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter an integer: ");
		Scanner scan= new Scanner(System.in);
		int number= scan.nextInt();
		
		int factorial=1;
		for(int i=1; i<=number; i++) {
			factorial*=i;
		}
		System.out.println("The factorial of "+number+" is "+factorial);
		
		scan.close();
	}

}

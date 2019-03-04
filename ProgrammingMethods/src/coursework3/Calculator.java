package coursework3;
import java.util.*;
public class Calculator {
	
	public static int add(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static int mult(int a, int b) {
		return a*b;
	}
	public static int div(int a, int b) {
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an interger:");
		int num1 = scan.nextInt();
		System.out.print("\nEnter another integer:");
		int num2= scan.nextInt();
		
		System.out.println("\nAdd(1)\tabSubtract(2)\nMultiply(3)\tDivide(4)");
		System.out.print("Choose an operation:");
		int choice= scan.nextInt();
		switch(choice) {
		case 1: System.out.println(add(num1,num2));
		break;
		case 2: System.out.println(sub(num1,num2));
		break;
		case 3: System.out.println(mult(num1,num2));
		break;
		case 4: System.out.println(div(num1,num2));
		}
		scan.close();
	}

}

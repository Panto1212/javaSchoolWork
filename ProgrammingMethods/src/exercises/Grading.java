package exercises;
import java.util.*;
public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("What did you get?");
		Scanner s = new Scanner(System.in);
		double mark= s.nextDouble();
		
		if (mark>=75) {
			System.out.println("A");
		}
		else if (mark>=50 && mark<75) {
			System.out.println("B");
		}
		else if (mark>=25 && mark<50) {
			System.out.println("C");
		}
		else if (mark<25) {
			System.out.println("F");
		}
		else System.out.println("Invalid number");
s.close();
	}

}

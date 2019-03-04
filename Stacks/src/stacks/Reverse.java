package stacks;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Stack<String> rev= new Stack<String>();
		
		rev.push("Tashev        Sylvia     95");
		rev.push("Todd          Kim        52");
		rev.push("White         Steven     84");
		rev.push("Yeilding      Janet      87");
		
		Queue <String> erse= new LinkedList<String>();
		
		while (!rev.isEmpty()) {
			erse.add(rev.pop());
		}
System.out.println(erse);

	}

}

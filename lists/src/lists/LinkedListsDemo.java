package lists;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<String>();
		q.add("Patience");
		q.add("4");
		q.add("Marvin");
		q.add("Davido");// front [42, -3, 17] back

		System.out.println(q.remove()); 
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		

}
}

package stacks;

import java.util.*;


public class Mirrorring {
	
	public static void mirror(Queue<String> sample) {
		ArrayList<String> temporaryArry = new ArrayList<String>(sample);  //array to store values in the input queue
	    Stack<String> reversed = new Stack<String>();           //create a stack
	    while (!sample.isEmpty()) {
	    	reversed.push(sample.remove());                //give stack values of the input queue
	    }
	    while (!reversed.isEmpty()) {
	    	temporaryArry.add(reversed.pop());          //add stack values to array
	    }
	    
	    Queue<String> newQueue = new LinkedList<String>(temporaryArry);
	    System.out.println(newQueue);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner  scan= new Scanner(System.in);
		    System.out.println("How long do you want your queue to be?"); //get length of queue
		    int queueLength= scan.nextInt(); //get the length of queue
		    System.out.println("Enter "+ queueLength+ " strings:");  //get the queue items
		    
		    Queue<String> originalQueue = new LinkedList<String>();   //inputqueue
		    for (int i=1; i<=queueLength; i++) {
		    System.out.print(i + ":");
		    originalQueue.add(scan.next());
		    }
		    System.out.println("Your queue is : "+ originalQueue);    //display the input queue
		    
		    mirror(originalQueue);                                //calling the mirror method
		    
		    scan.close();
	}

}

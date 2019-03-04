package doubling;
import java.util.*;

public class Doubling {
	
	public static void stutter(Queue<Integer> sample) {
		int lengthofQueue = sample.size();
		
		 ArrayList <Integer> arry= new ArrayList<Integer>(sample);  //convert the input queue into an array
		 ArrayList<Integer> otherArry = new ArrayList<Integer>();         //create another array for duplication of elements
		    for (int i=0; i<lengthofQueue; i++) {
		    	for (int j=1; j<=2; j++) {                                  //doubling
		    		otherArry.add(arry.get(i));
		    	}
		    }		                       
		    Queue<Integer> newQueue = new LinkedList<Integer>(otherArry);        //outputqueue
		    System.out.println("Your new queue is : "+ newQueue);      
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner  scan= new Scanner(System.in);
    System.out.println("How long do you want your queue to be?"); //get length of queue
    int queueLength= scan.nextInt(); //get the length of queue
    System.out.println("Enter "+ queueLength+ " integers:");  //get the queue items
    
    Queue<Integer> originalQueue = new LinkedList<Integer>();   //inputqueue
    for (int i=1; i<=queueLength; i++) {
    System.out.print(i + ":");
    originalQueue.add(scan.nextInt());
    }
    System.out.println("Your queue is : "+ originalQueue);    //display the input queue
    
    stutter(originalQueue);           //call the stutter method       
    scan.close();
	}
	
}

package node;

public class LinkedListStack {
LinkList linkedlist=new LinkList();

public void push(int data) {
	linkedlist.insertFirst(data);
}
public void pop() {
	while(!linkedlist.isEmpty()) {
		linkedlist.deleteFirst();
	}
	
}
public void displayStack() {
	System.out.println(" ");
	linkedlist.displayList();
}
}

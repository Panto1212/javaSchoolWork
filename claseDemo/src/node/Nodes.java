package node;

public class Nodes {
	public int data;
	public Nodes next;
	
	public Nodes(int data) {
		this.data=  data;
	}
public void displayNodes() {
	System.out.print(data);
	System.out.print(" ");
}
}

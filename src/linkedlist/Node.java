package linkedlist;

public class Node {
	Node next = null;
	int data;
	
	public Node(int d) {
		data = d;
	}
	
	public void appendToTail(int d){
		Node end = new Node(d);
		Node n = this;
		
		while (n.next!=null) {
			n = n.next;
		}
		n.next = end;
	}
	
	public void print(Node node) {
		while (node!=null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
	
	Node deleteNode(Node head, int d) {
		Node n = head;
		
		if(n.data==d) {
			return head.next; // moved head
		}
		
		while(n.next != null) {
			if (n.next.data == d) {
				n.next = n.next.next;
			}
			n = n.next;
		}
		
		return head;
	}
	
}

package linkedlist;

public class P2 {
	
	public static void main(String[] args) {
	
	Node node = new Node(2);
	node.appendToTail(4);
	node.appendToTail(5);
	node.appendToTail(4);
	remDuplicates(node);
	
	node.print(node);
	
	}
	
	public static void remDuplicates(Node node) {
		
		while(node!=null) {
			Node node1 = node;
			
			while(node1!=null) {
				if(node.data == node1.data) {
					node.deleteNode(node, node.data);
					node1.deleteNode(node1, node1.data);
				}
				node1 = node1.next;
			}
			node = node.next;
		}
		
	}
	
	
}

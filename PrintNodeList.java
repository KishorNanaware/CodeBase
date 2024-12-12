package myPack;

public class PrintNodeList {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next= new Node(30);
		head.next.next.next= new Node(40);
		
        printList(head);
	}

	private static void printList(Node head) {
		while(head!=null) {
			System.out.println(head.data+" ");
			 head = head.next;
		}		
	}
}

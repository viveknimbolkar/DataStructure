package Linked_List;
/*
This is linked list program
 */
public class LinkedList{

	Node head;

	//create a static class to get data and address of next node
	static class Node{

		int data;
		Node next;

		//node constructor
		Node(int d){

			data = d;
			next = null;
		}
	}

//print the link list
	public void printList() {

		Node n = head;

		//if last next value is null then get out of the loop
		while (n != null){

			System.out.println(n.data+" ");

			n = n.next;
		}
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.head = new Node(10); //assign the first node to the head
		Node two = new Node(20);
		Node three = new Node(30);
		Node four = new Node(40);

		list.head.next = two;//assign the address of next node to two
		two.next = three;
		three.next = four;

		//print the linked list
		list.printList();

	}

}
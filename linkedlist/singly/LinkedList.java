package linkedlist.singly;
/*
This is a linked list program. Here i perform traversal and insertion.
head = First Node
next = Address of next node
 */
public class LinkedList{

	Node head; //head (starting point)

	//create a static class to get data and address of next node
	static class Node{
		int data; //variable to store data
		Node next; //address of next node
		//node constructor
		Node(int d){
			data = d; //assign the data taken from the user
			next = null; //set the next address as null
		}
	}

//print the link list
	public void printList(Node node) {
		//if last next value is null then get out of the loop
		while (node != null){
			System.out.println(node.data+" "); //iterate through the list and traverse it
			node = node.next; //go to the next node address
		}
	}

	/*
		This method add a new node at the beginning of the linked list i.e. at head.
		To add a new node at the begineeing, we need to create a new node and poiting its address to the head.
		Basically it is a 4 step process.

		STEPS:- 1) create a new node object
				2) make a next node of new Node as head
				3) point this head towards the next node
	 */
	public void addAtBeginning(int newdata){
		//create a new Node object
		Node newNode = new Node(newdata);
		//create a new head
		newNode.next = head;
		head = newNode;
	}

	/*
	To add a new element at the given position we need two information about the linked list
	i.e. 1. Previous Node
		 2. New Item which we are goint to be add
	Basically, it is a 4 step process,,
	STEPS:-  1) Create a new node and pass the new data as its paramater
			 2) Make the next of newNode of previous_node
			 3) Set the next address of previous to newNode
	 */
	public void addAtGivenNode(Node previous_node, int new_data){
		//check if the previous node is null or not
		//if it is null then show an error message
		if (previous_node == null){
			System.out.println("Previous Node should not be null");
			return;
		}
		//create a object of new Node and pass new_data as a new data to be added
		Node newNode = new Node(new_data);
		newNode.next = previous_node.next; //make the next of newNode of previous_node
		previous_node.next = newNode; //set the next address of previous_node to newnode
	}

	/*
	To add an element to the last of the linkedList we need to traverse the linked list upto the end.
	Because, we know that we can't access the specific node directly.
	STEP:- 1) Check if the list is empty or not. If it is empty, then set the give Node as a head.
		   2) if list is not empty, then set the next of that Node null. Because as it is last node, then it is empty.
		   3) Now let's traverse to the last node using while loop
		   4) Set the address of the node as newNode
	 */
	public void addAtEnd(int new_data){
		//create a new node
		Node new_node = new Node(new_data);
		//check if list is empty or not
		if (head == null){
			head = new Node(new_data); //if list is empty then set current head as a first node
			return;
		}
		//else set the next address of node to null (coz it is going to be last)
		new_node.next = null;
		Node last = head; //set the head at first node and then traverse
		while(last.next != null)
			last = last.next; //traversing
		last.next = new_node; //set the last node to new node
		return;
	}

	//delete a node from any node
	public void deleteNode(int value){
		Node temp = head, prev = null;
		//if the give value is found at the head
		if (temp != null && temp.data == value){
			head = temp.next;
			return;
		}
		//traverse through the list to delete a given value
		while (temp != null && temp.data != value){
			prev = temp;
			temp = temp.next;
		}
		//if the given node has null value then return
		if (temp == null)
			return;
		//unlink the previous link from the main node
		prev.next = temp.next;
	}


	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node(10); //assign the first node to the head

		Node two = new Node(20);
		Node three = new Node(30);
		Node four = new Node(40);

		list.head.next = two;//assign the address of next
		two.next = three;
		three.next = four;

		//adding new node at the starting
//		list.addAtBeginning(77);  //adding at the beginning
//		list.addAtGivenNode(three, 88); //adding after the giving node
//		list.addAtEnd(56);
		System.out.println("Before Delete ");
		list.printList(list.head);
//		list.deleteNodeAtPosition(0);
		System.out.println("After Delete ");
		list.printList(list.head);
	}

}
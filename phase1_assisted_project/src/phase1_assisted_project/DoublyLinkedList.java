package phase1_assisted_project;

public class DoublyLinkedList {
Node head;
static class Node {
	int data;
	Node next;
	Node prev;
	Node(int d) {
		prev = null;
		data = d;
		next = null;
	}
}
public static DoublyLinkedList insert(DoublyLinkedList list, int data) {
	Node adddata = new Node(data);
	if (list.head == null) {
		list.head = adddata;
	} else {
		Node last = list.head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = adddata;
		adddata.prev = last;
	}
	return list;
}
public static void printList(DoublyLinkedList list) {
	Node last = list.head;
	System.out.print("LinkedList: ");
	while (last != null) {
		System.out.print(last.data + " ");
		last = last.next;
	}
	System.out.println();
}

public static void printListReverse(DoublyLinkedList list) {
	Node last = list.head;
	System.out.print("Reverse LinkedList: ");
	while (last.next != null) {
		last = last.next;
	}

	while (last != null) {
		System.out.print(last.data + " ");
		last = last.prev;
	}

	
}

public static void main(String[] args) {

	DoublyLinkedList list = new DoublyLinkedList();

	list = insert(list, 12);
	list = insert(list, 24);
	list = insert(list, 34);
	list = insert(list, 45);
	list = insert(list, 55);
	list = insert(list, 66);
	list = insert(list, 77);
	list = insert(list, 88);
	
	printList(list);
	printListReverse(list);

}
}

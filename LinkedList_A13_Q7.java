

	class Node {
	    int data;
	    Node prev;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.prev = null;
	        this.next = null;
	    }
	}

	class DoublyLinkedList {
	    Node head;

	    public void add(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	            newNode.prev = current;
	        }
	    }

	    public void reverse() {
	        Node current = head;
	        Node temp = null;

	        while (current != null) {
	            temp = current.prev;
	            current.prev = current.next;
	            current.next = temp;
	            current = current.prev;
	        }

	        if (temp != null) {
	            head = temp.prev;
	        }
	    }

	    public void printList() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
	}

	public class LinkedList_A13_Q7 {
	    public static void main(String[] args) {
	        DoublyLinkedList list = new DoublyLinkedList();

	        // Add elements to the doubly linked list
	        list.add(10);
	        list.add(8);
	        list.add(4);
	        list.add(2);

	        // Reverse the doubly linked list
	        list.reverse();

	        // Print the reversed list
	        list.printList();
	    }
	}


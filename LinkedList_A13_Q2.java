

	class Node {
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class LinkedList {
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
	        }
	    }

	    public void removeDuplicates() {
	        Node current = head;

	        while (current != null && current.next != null) {
	            if (current.data == current.next.data) {
	                current.next = current.next.next;
	            } else {
	                current = current.next;
	            }
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

	public class LinkedList_A13_Q2 {
	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();

	        // Add elements to the linked list in non-decreasing order
	        list.add(11);
	        list.add(11);
	        list.add(11);
	        list.add(21);
	        list.add(43);
	        list.add(43);
	        list.add(60);

	        // Remove duplicate nodes
	        list.removeDuplicates();

	        // Print the updated list
	        list.printList();
	    }
	}


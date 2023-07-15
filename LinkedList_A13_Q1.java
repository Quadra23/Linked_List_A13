

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

	    public void createNewList(LinkedList list1, LinkedList list2) {
	        Node current1 = list1.head;
	        Node current2 = list2.head;
	        LinkedList newList = new LinkedList();

	        while (current1 != null && current2 != null) {
	            if (current1.data > current2.data) {
	                newList.add(current1.data);
	            } else {
	                newList.add(current2.data);
	            }
	            current1 = current1.next;
	            current2 = current2.next;
	        }

	        // If one list is longer than the other, add remaining nodes to the new list
	        while (current1 != null) {
	            newList.add(current1.data);
	            current1 = current1.next;
	        }

	        while (current2 != null) {
	            newList.add(current2.data);
	            current2 = current2.next;
	        }

	        newList.printList();
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

	public class LinkedList_A13_Q1 {
	    public static void main(String[] args) {
	        LinkedList list1 = new LinkedList();
	        LinkedList list2 = new LinkedList();

	        // Add elements to the first linked list
	        list1.add(5);
	        list1.add(2);
	        list1.add(3);
	        list1.add(8);

	        // Add elements to the second linked list
	        list2.add(1);
	        list2.add(7);
	        list2.add(4);
	        list2.add(5);

	        // Create the new linked list using the two given lists
	        list1.createNewList(list1, list2);
	    }
	}


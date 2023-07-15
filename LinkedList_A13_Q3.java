

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

	    public Node reverseKNodes(Node head, int k) {
	        Node current = head;
	        Node next = null;
	        Node prev = null;
	        int count = 0;

	        // Reverse the first k nodes
	        while (current != null && count < k) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	            count++;
	        }

	        // If there are remaining nodes, recursively reverse them
	        if (next != null) {
	            head.next = reverseKNodes(next, k);
	        }

	        return prev;
	    }

	    public void printList(Node head) {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
	}

	public class LinkedList_A13_Q3 {
	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();

	        // Add elements to the linked list
	        list.add(1);
	        list.add(2);
	        list.add(2);
	        list.add(4);
	        list.add(5);
	        list.add(6);
	        list.add(7);
	        list.add(8);

	        int k = 4;

	        // Reverse every k nodes in the linked list
	        list.head = list.reverseKNodes(list.head, k);

	        // Print the updated list
	        list.printList(list.head);
	    }
	}

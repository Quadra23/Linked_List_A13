

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

	    public Node reverseAlternateKNodes(Node head, int k) {
	        if (head == null || head.next == null) {
	            return head;
	        }

	        Node current = head;
	        Node prev = null;
	        Node next = null;
	        int count = 0;

	        // Reverse k nodes
	        while (current != null && count < k) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	            count++;
	        }

	        // Skip the next k nodes
	        count = 0;
	        while (current != null && count < k - 1) {
	            current = current.next;
	            count++;
	        }

	        // Recursively reverse the remaining alternate k nodes
	        if (current != null) {
	            current.next = reverseAlternateKNodes(current.next, k);
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

	public class LinkedList_A13_Q4 {
	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();

	        // Add elements to the linked list
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);
	        list.add(6);
	        list.add(7);
	        list.add(8);
	        list.add(9);

	        int k = 3;

	        // Reverse every alternate k nodes in the linked list
	        list.head = list.reverseAlternateKNodes(list.head, k);

	        // Print the updated list
	        list.printList(list.head);
	    }
	}


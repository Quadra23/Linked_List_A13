

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

	    public void deleteLastOccurrence(int key) {
	        if (head == null) {
	            return;
	        }

	        Node keyNode = null;
	        Node current = head;
	        Node prev = null;
	        Node prevKeyNode = null;

	        // Traverse the list to find the last occurrence of the key
	        while (current != null) {
	            if (current.data == key) {
	                keyNode = current;
	                prevKeyNode = prev;
	            }
	            prev = current;
	            current = current.next;
	        }

	        // If the key is found, delete the node
	        if (keyNode != null) {
	            if (prevKeyNode != null) {
	                prevKeyNode.next = keyNode.next;
	            } else {
	                head = keyNode.next;
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

	public class LinkedList_A13_Q5 {
	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();

	        // Add elements to the linked list
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(5);
	        list.add(2);
	        list.add(10);

	        int key = 2;

	        // Delete the last occurrence of the key
	        list.deleteLastOccurrence(key);

	        // Print the updated list
	        list.printList();
	    }
	}


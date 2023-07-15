

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

	    public void deleteNode(int position) {
	        if (head == null) {
	            return;
	        }

	        Node current = head;
	        int count = 1;

	        // Traverse to the given position
	        while (current != null && count < position) {
	            current = current.next;
	            count++;
	        }

	        // If the node is found, delete it
	        if (current != null) {
	            if (current.prev != null) {
	                current.prev.next = current.next;
	            } else {
	                head = current.next;
	            }
	            if (current.next != null) {
	                current.next.prev = current.prev;
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

	public class LinkedList_A13_Q8 {
	    public static void main(String[] args) {
	        DoublyLinkedList list = new DoublyLinkedList();

	        // Add elements to the doubly linked list
	        list.add(1);
	        list.add(3);
	        list.add(4);

	        int position = 3;

	        // Delete the node at the given position
	        list.deleteNode(position);

	        // Print the updated list
	        list.printList();
	    }
	}




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

	    public Node mergeSortedLists(Node a, Node b) {
	        if (a == null) {
	            return b;
	        }
	        if (b == null) {
	            return a;
	        }

	        Node result;
	        if (a.data <= b.data) {
	            result = a;
	            result.next = mergeSortedLists(a.next, b);
	        } else {
	            result = b;
	            result.next = mergeSortedLists(a, b.next);
	        }

	        return result;
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

	public class LinkedList_A13_Q6 {
	    public static void main(String[] args) {
	        LinkedList listA = new LinkedList();
	        LinkedList listB = new LinkedList();

	        // Add elements to the first linked list
	        listA.add(5);
	        listA.add(10);
	        listA.add(15);

	        // Add elements to the second linked list
	        listB.add(2);
	        listB.add(3);
	        listB.add(20);

	        // Merge the sorted lists
	        LinkedList mergedList = new LinkedList();
	        mergedList.head = mergedList.mergeSortedLists(listA.head, listB.head);

	        // Print the merged list
	        mergedList.printList(mergedList.head);
	    }
	}

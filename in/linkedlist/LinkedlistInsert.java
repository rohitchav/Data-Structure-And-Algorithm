package in.linkedlist;

public class LinkedlistInsert {
    private Node head; // Head of the LinkedList

    // Node class
    private static class Node {
        int data;
        Node next;

        Node(int item) {
            this.data = item;
            this.next = null;
        }
    }
    public void insertAtStarting(int item){
        Node newNode = new Node(item);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // Insert a new node at the end
    public void insertAtEnd(int item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void insertAtIndex(int item, int index) {
        Node newNode = new Node(item);

        // If inserting at the head (index 0)
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Traverse to the node before the desired index
        Node temp = head;
        int currentIndex = 0;

        while (temp != null && currentIndex < index - 1) {
            temp = temp.next;
            currentIndex++;
        }

        // If the index is out of bounds
        if (temp == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        // Insert the new node at the specified index
        newNode.next = temp.next;
        temp.next = newNode;
    }


    // Print the LinkedList
    public void printLinkedList() {
        if (head == null) {
            System.out.println("LinkedList is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" => ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

}

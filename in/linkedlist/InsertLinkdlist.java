package in.linkedlist;

public class InsertLinkdlist {
    public static void main(String[] args) {
        LinkedlistInsert node1 = new LinkedlistInsert();
        node1.insertAtEnd(12);
        node1.insertAtEnd(13);
        node1.insertAtStarting(11);
        node1.printLinkedList();
        node1.insertAtEnd(15);
        node1.printLinkedList();
        node1.insertAtStarting(9);
        node1.printLinkedList();
        node1.insertAtIndex(14,4);
        node1.printLinkedList();
    }
}

package linklist;

public class Node {
    private int data;
     Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

package linklist;

public class Linklist {
    Node head = null;

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
    public void insertAtEnding(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;

    }
    public void insertAtRandom(int position, int data) {
        Node newNode = new Node(data);

        // If inserting at the head (position 0)
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int currentIndex = 0;

        // Traverse the list to find the node before the desired position
        while (temp != null && currentIndex < position - 1) {
            temp = temp.next;
            currentIndex++;
        }

        // Check if the position is out of bounds
        if (temp == null) {
            System.out.println("Index Out Of Bound..");
            return;
        }

        // Insert the new node
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteFromBeginning(){
        if(head==null){
            System.out.println("Sorry..Linkdlist Is Empty");
        }
        head = head.next;
    }
    public void deleteFromEnd(){
        if(head==null){
            System.out.println("Sorry..Linkdlist Is Empty");
        }
        if(head.next == null){
            head=null;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        System.out.println("Node Deleted Successfully..");
    }
    public void deleteFromIndex(int index){
       if(head==null){
           System.out.println("No Element In Linked List For Deletion");
           return;
       }
       if(index==0){
           head=head.next;
           return;
       }

       int currentIndex = 0;
       Node temp = head;
       while (temp.next!=null){
           if(currentIndex==index-1){
               temp.next = temp.next.next;
               System.out.println("Node Deleted Succesfully");
               break;
           }
           currentIndex++;
           temp = temp.next;
       }
    }

    public void searchData(int data){
        boolean flag = false;
        if(head==null){
            System.out.println("LinkedList Is Empty");
        }
        Node temp = head;
        while (temp!=null){
            if(temp.getData()==data){
                flag = true;
            }
            temp = temp.next;
        }
        if(flag){
            System.out.println("Data Found..");
        }else{
            System.out.println("Data Not Found..");
        }
    }
    public void printLinkedList(){
        if(head==null){
            System.out.println("Linked List Is Empty..");
            return;
        }

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.getData());
            if(temp.next!=null){
                System.out.print(" => ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}

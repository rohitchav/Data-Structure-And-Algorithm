package linklist;

import java.util.Scanner;

public class Linkedlist {
    public static void printMenu(){
        System.out.println("********Menu********");
        System.out.println("1.Insert \n2.Delete \n3.Search \n4.Display \n5.Exit");
        System.out.println("********************");
        System.out.print("Enter Your Choice= ");
    }
    public static void insertOperation(Linklist linkedlist,Scanner sc){
        System.out.println("++++Welcome To Insert Operation++++");
        System.out.println("1.Insert To Beginning\n2.Insert To End\n3.Insert At Random");
        System.out.print("Enter Your Choice= ");
        int choice = sc.nextInt();
        System.out.print("Enter Data Element= ");
        int data = sc.nextInt();
        switch (choice){
            case 1:
                linkedlist.insertAtBeginning(data);
                System.out.println("SUCCESS");
                break;
            case 2:
                linkedlist.insertAtEnding(data);
                System.out.println("SUCCESS");
                break;
            case 3:
                System.out.print("Enter Position= ");
                int position = sc.nextInt();
                linkedlist.insertAtRandom(position,data);
                System.out.println("SUCCESS");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
    public static void searchElement(Linklist linklist,Scanner sc){
        System.out.print("Enter Element Which You Have To Find= ");
        int data = sc.nextInt();
        linklist.searchData(data);
    }
    public static void displayElement(Linklist linkdlist){
        linkdlist.printLinkedList();
    }
    public static void deleteOperation(Linklist linkdlist,Scanner sc){
        System.out.println("-----Welcome To Delete Operation-----");
        System.out.println("1.Delete From Begin\n2.Delete From End\n3.Delete From Position");
        System.out.println("Enter Choice= ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                linkdlist.deleteFromBeginning();
                break;
            case 2:
                linkdlist.deleteFromEnd();
                break;
            case 3:
                System.out.print("Enter Position Of Element= ");
                int position = sc.nextInt();
                linkdlist.deleteFromIndex(position);
                break;
            default:
                System.out.println("Invalid Index");
        }
        System.out.println("DELETED");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linklist linkdlist = new Linklist();
    try {
        while (true){
            printMenu();
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    insertOperation(linkdlist,sc);
                    break;
                case 2:
                    deleteOperation(linkdlist,sc);
                    break;
                case 3:
                    searchElement(linkdlist,sc);
                    break;
                case 4:
                    System.out.print("Elements In LinkedList: ");
                    displayElement(linkdlist);
                    break;
                case 5: System.out.println("Thanks For Using App...!");
                    break;
                default:
                    System.out.println("Invalid Index");
            }
        }
    }
    catch (Exception e){
        System.out.println(e.getMessage());
       }
    }
}

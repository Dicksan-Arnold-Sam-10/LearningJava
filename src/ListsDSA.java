import java.util.Scanner;

class LinkedList{
    int value;
    LinkedList next;
    LinkedList(){}
    LinkedList(int value){ this.value = value; }
}
public class ListsDSA {
    static void removeFirstNode(LinkedList node){
        node.value = node.next.value;
        node.next = node.next.next;
    }
    static LinkedList insertAtFirst(LinkedList node,int n){
        LinkedList start = new LinkedList(n);
        start.next = node;
        node = start;
        return node;
    }
    static void insertAtlast(LinkedList dummy,int n){
        dummy.next = new LinkedList(n);
    }
    public static void main(String[] args){
        LinkedList head = new LinkedList();
        LinkedList dummy = head;
        Scanner in = new Scanner(System.in);
        System.out.println("SET SIZE FOR LINKED LIST: ");
        int size = in.nextInt();
        int n;
        while(size>0){
            System.out.print("ENTER THE VALUE: ");
            n = in.nextInt();
            dummy.value = n;
            size--;
            if(size==0){break;}
            dummy.next = new LinkedList();
            dummy = dummy.next;
        }
        removeFirstNode(head);
        head = insertAtFirst(head,11);
        insertAtlast(dummy,10);
        do {
            System.out.println(head.value);
            head=head.next;
        }while(head!=null);
    }
}

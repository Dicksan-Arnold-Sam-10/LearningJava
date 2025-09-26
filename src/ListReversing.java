import java.util.Scanner;

class ListNode{
    int value;
    ListNode next;
    ListNode(){}
//    ListNode(int value){ this.value = value; }
}
public class ListReversing {
    static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args){
        ListNode node = new ListNode();
        ListNode head = node;
        Scanner in = new Scanner(System.in);
        System.out.println("SET LIMIT: ");
        int n = in.nextInt();
        int num;
        while(n>0){
            System.out.print("ENTER THE VALUE: ");
            num = in.nextInt();
            n--;
            node.value = num;
            if(n==0){break;}
            node.next = new ListNode();
            node = node.next;
        }
        head = reverseList(head);
        while(head!=null){
            System.out.println(head.value);
            head = head.next;
        }
    }
}

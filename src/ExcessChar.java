import java.util.Scanner;

public class ExcessChar {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s;
        String t;
        System.out.println("ENTER SOURCE STRING: ");
        s = in.nextLine();
        System.out.println("ENTER MIXED STRING: ");
        t = in.nextLine();
        int num1 = 0;
        int num2 = 0;
        for(int i=0;i<s.length();i++){
            num1 += s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            num2 += t.charAt(i);
        }
        char ch = (char) (num2 - num1);
        System.out.println("EXCESS CHARACTER : "+ch);
    }
}

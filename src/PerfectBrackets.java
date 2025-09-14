import java.util.Scanner;
class BracketChecker{

    public boolean check(String bracket,int len){
        int top=-1;
        char[] stack = new char[len];
            for(int i=0;i<len;i++) {
                char ch = bracket.charAt(i);
                if (ch == '[' || ch == '{' || ch == '(' || ch == '<') {
                    stack[++top] = ch;
                } else {
                    if(top<0){return false;}
                    if ((ch == '>' && stack[top] == '<') || (ch == '}' && stack[top] == '{') || (ch == ')' && stack[top] == '(') || (ch == ']' && stack[top] == '[')) {
                        top--;
                    } else {
                        return false;
                    }
                }
            }
        return top==-1;
    }
}
public class PerfectBrackets {
    public static void main(String[] args){
        BracketChecker obj = new BracketChecker();
        Scanner in = new Scanner(System.in);
        String brackets;
        System.out.println("ENTER THE Brackets: ");
        brackets = in.nextLine();
        boolean flag = obj.check(brackets,brackets.length());
        if(flag){
            System.out.println("VALID BRACKETS");
        }else{
            System.out.println("INVALID BRACKETS");
        }
    }
}

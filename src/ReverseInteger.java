import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num,rem;
        int rev = 0;
        System.out.print("ENTER A NUMBER: ");
        num = sc.nextInt();
        int original = num;
        while(num!=0){
            rem = num%10;
            rev = rev*10+rem;
            num /= 10;
        }
        System.out.println("THE REVERSED NUMBER IS "+rev);

//        PALINDROME CHECKING LOGIC

        if(rev == original){
            System.out.println("THE GIVEN NUMBER "+original+" IS A PALINDROME");
        }else{
            System.out.println("THE GIVEN NUMBER "+original+" IS NOT A PALINDROME");
        }
    }
}
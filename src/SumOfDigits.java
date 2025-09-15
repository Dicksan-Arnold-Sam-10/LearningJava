import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num,rem;
        int sum=0;

        System.out.print("ENTER THE NUMBER: ");
        num = sc.nextInt();

        if(num<0){
            num = -num;
        }

        while(num!=0 || sum>9){ // finding the sum of digits until one digit
            if(num==0){
                num = sum;
                sum = 0;
            }
            rem = num%10;
            sum += rem;
            num /= 10;
        }

        System.out.println("THE SUM OF DIGITS IS "+sum);
    }
}
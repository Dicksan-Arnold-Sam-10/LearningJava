import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("ENTER A NUMBER: ");
        num = sc.nextInt();
        while(num%2==0){
            num/=2;
        }
        if(num==1){
            System.out.println("THE NUMBER "+num+" IS POWER OF TWO");
        }else{
            System.out.println("THE NUMBER "+num+" IS NOT A POWER OF TWO");
        }
    }
}

import java.util.Scanner;

public class NPrime {
    static boolean isPrime(int n){
        if(n==1 || n==2 || n==3){ return true; }
        if(n<1){ return false; }
        boolean flag = false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }else{
                flag = true;
            }
        }
        return flag;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("SET LIMIT: ");
        int limit = in.nextInt();
        int i = 1;
        while(limit>0){
            if(isPrime(i)){
                System.out.print(i+" ");
                limit--;
            }
            i++;
        }
    }
}

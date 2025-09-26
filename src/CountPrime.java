import java.util.Scanner;

public class CountPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("SET THE LIMIT: ");
        int n = sc.nextInt();
        boolean[] prime = new boolean[n];

        for(int i=2;i*i<n;i++){
            for(int j=i*i;j<n;j+=i){
                prime[j-1]=true;
            }
        }

        int count=0;
        for(boolean bool:prime){
            if(!bool){
                count++;
            }
        }

        count-=2;

        System.out.println("THE TOTAL PRIME NUMBERS ARE "+count);
        sc.close();
    }
}

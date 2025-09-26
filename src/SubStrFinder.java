import java.util.Scanner;

public class SubStrFinder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE STRING: ");
        String haystack = sc.nextLine();
        System.out.print("ENTER THE SUBSTRING: ");
        String needle = sc.nextLine();

        int len1 = haystack.length();
        int len2 = needle.length();
        int flag = 0;

        for(int i=0;i<=len1-len2;i++){
            if(haystack.substring(i,i+(len1-len2)).equals(needle)){
                System.out.println(i);
                flag = 1;
                break;
            }
        }
        if(flag==0){
            System.out.println(-1);
        }
    }
}

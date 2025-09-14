import java.util.Scanner;

public class ArrayObjects {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Xshape[] sx = new Xshape[5];
        int n;
        for (Xshape xshape : sx) {
            System.out.println("SET LIMIT FOR PATTERN: ");
            n = sc.nextInt();
            xshape = new Xshape(n);
            xshape.displayXshape();
            System.out.println(xshape);
        }
    }
}
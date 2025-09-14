public class XBoxShape {
    public static void main(String[] args){
//        int k=5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || i==5){
                    System.out.print("*");
                    continue;
                }
                if(j>1 && j<5) {
                    if(j==i || (5-i+1)==j){         //can also use k in 2nd condition (k==j)
                        System.out.print("*");
//                        k--;
                    }else {
                        System.out.print(" ");
                    }
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

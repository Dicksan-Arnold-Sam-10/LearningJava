public class Xshape {
    int n,k;
    Xshape(int val){
        n = val;
        k = n;
    }
    void displayXshape(){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((j==i)||(j==k)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            k--;
        }
    }
}

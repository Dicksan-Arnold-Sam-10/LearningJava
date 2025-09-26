import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i=0;
        int j=0;
        int val;
        int[] nums = new int[5];

        System.out.print("ENTER THE TARGET VALUE TO REMOVE : ");
        val = in.nextInt();

        System.out.println("ENTER THE ELEMENTS INTO THE ARRAY,");
        for(int k=0;k<nums.length;k++){
            nums[k] = in.nextInt();
        }

        while(i<nums.length){
            if(val!=nums[i]){
                nums[j++]=nums[i];
            }
            i++;
        }

        for(int item: nums){
            System.out.print(" "+item);
        }
    }
}

public class LearningStringBuffer {
    public static void main(String[] args){
        String str1 = "hEllO";
        String[] str2 = {"apple","mango","banana"};
        StringBuffer s1 = new StringBuffer("hello");
        System.out.println(str2[1]);
        System.out.println(s1.capacity());
        str1 = str1.toLowerCase();
        System.out.println(str1);
    }
}

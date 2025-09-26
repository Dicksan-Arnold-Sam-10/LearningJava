class sample{
    static String name;
    static{
        System.out.println("HELLO i am a static block");
    }
    sample(){
        System.out.println("HELLO i am a constructor");
    }
    public static void show(){
        System.out.println(name);
    }
}
public class JavaStaticBlock {
    public static void main(String[] args)throws ClassNotFoundException{
        Class.forName("sample");
        sample.name = "Dicksan Arnold Sam S";
        sample.show();
    }
}
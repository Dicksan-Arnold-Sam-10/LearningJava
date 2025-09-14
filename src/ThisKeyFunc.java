import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class DisplayMarks{
    public void markDetail(MarkCalc obj){
        for(Map.Entry<String,Float> items:obj.marks.entrySet()){
            System.out.println(items.getKey()+" - "+items.getValue());
        }
        System.out.println("TOTAL MARK = "+obj.total);
        System.out.println("TOTAL AVERAGE = "+obj.totalAVG);
        System.out.println("CGPA = "+obj.CGPA);
    }
}

class MarkCalc{
    Scanner in = new Scanner(System.in);
    Map<String,Float> marks = new HashMap<>();
    int totalSubjects;
    float CGPA;
    float total;
    float totalAVG;

    public MarkCalc() {}

    public void markEntry(){
        System.out.print("ENTER THE TOTAL NUMBER OF SUBJECTS : ");
        totalSubjects = in.nextInt();
        in.nextLine();
        for(int i=1;i<=totalSubjects;i++){
            System.out.print("SUBJECT : ");
            String subjectName = in.nextLine();
            System.out.print("MARKS : ");
            float mark = in.nextFloat();
            in.nextLine();
            marks.put(subjectName, mark);
        }
        in.close();
    }

    public void findCGPA(){
        for(Map.Entry<String, Float> items : marks.entrySet()){
            total += items.getValue();
        }
        totalAVG = total / totalSubjects;
        CGPA = totalAVG / 10;
    }

    public void showDetails(DisplayMarks obj){
        obj.markDetail(this);
    }
}

public class ThisKeyFunc{
    public static void main(String[] args){
        DisplayMarks obj1 = new DisplayMarks();
        MarkCalc obj2 = new MarkCalc();
        obj2.markEntry();
        obj2.findCGPA();
        obj2.showDetails(obj1);
    }
}
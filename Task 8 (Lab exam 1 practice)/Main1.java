
import java.util.Scanner;
public class main1{
public static class course{
    String coursename;
    String[] names=new String[100];
    double[] marks=new double[100];
    int count=0;
     public course(String coursename){
        this.coursename=coursename;
     }
    public void addstudent(String name,double mark){
    names[count]=name;
    marks[count]=mark;
    count ++;
    }
    public String gethighetscorer(){
        int index=0;
        for(int i=0;i<count;i++){
            if (marks[i]>marks[index]){
                index=i;
            }
        }
        return names[index]+ "(" +marks[index]+ ")";
    }
    public int countopgrade(double thre){
        int c=0;
        for(int i=0;i<count;i++){
            if(marks[i]>=thre){
                c++;
            }
        }
        return c;
    }
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String coursename=sc.next();
    course c=new course(coursename);
    for(int i=0;i<3;i++){
        String name=sc.next();
        double mark=sc.nextDouble();
        c.addstudent(name,mark);
       
    }
    System.out.println(c.gethighetscorer());
    System.out.println("number of A+"+ c.countopgrade(80));
}
}

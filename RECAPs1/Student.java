import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Student{
    private String name;
    private int[] points;
    private int total=0;
    private double mmark;
    private List<Integer> markList = new ArrayList<Integer>();
    public Student(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    
    public void addExam(int mark){
        markList.add(mark);
    }
    public int getTotal(){
        int totalScore=0;
        for(Integer it: markList){
            totalScore = totalScore + it;
        }
        return totalScore;      
    }
    public double getMeanMark(){

        return (this.getTotal() / markList.size());
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
       
        String nume;
        double puncte;

        System.out.println("Enter the name of the student: ");
        nume = scan.nextLine();
        Student stud = new Student(nume);

        System.out.println("Enter the points the student achieved: ");

        String input = scan.nextLine();
        String[] marksInput = input.split(" ");
        
        for(String it: marksInput){
            stud.addExam(Integer.parseInt(it));
        }
        System.out.println(stud.markList);
        System.out.println(stud.getTotal());
        System.out.println(stud.getMeanMark());
        scan.close();
    }
}









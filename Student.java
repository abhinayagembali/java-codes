import java.util.*;
public class Student
{
    int rollno; 
    String name;
    int marks[] = new int[5];
    void input ()
    {
        Scanner sc1 = new Scanner(System.in);
        rollno = sc1.nextInt();
        name = sc1.next();
    }
    void readmarks()
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<5; i++)
        marks[i] = sc.nextInt();
    }
    void printStudent()
    {
        System.out.println("Rollnumber: "+rollno);
        System.out.println("Name: "+name);
        System.out.println("Grade: "+grade());
    }
    String grade()
    {
       double total = 0,avg;
       for ( int i=0; i<5;i++)
       total+=marks[i];
       avg=total/5;
       if(avg>=60)
          return "First";
       if(avg>=50)
         return "Second";
       if(avg>=40)
         return "third";
       else
         return "Fail";
    }
}
class Student1
{
    public static void main(String[] args) 
    {
       Student s1 = new Student();
       System.out.println("enter your roll number and name");
       s1.input();
       System.out.println("Enter 5 subject marks:");
       s1.readmarks();
       s1.printStudent();
   }
}
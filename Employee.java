import java.util.*;
class Employee
{
public static void main(String args[])
{
String name,gender,department;
int age;
float pf;
int bs=12000;
pf=(12*bs)/100;
Scanner sc=new Scanner(System.in);
System.out.println("enter the name");
name=sc.next();
System.out.println("enter the gender");
gender=sc.next();
System.out.println("enter the department");
department=sc.next();
System.out.println("enter the age");
age=sc.nextInt();
System.out.println(name);
System.out.println(gender);
System.out.println(department);
System.out.println(age);
System.out.println(pf);
}
}
import java.util.*;
class Variable
{
static int s=10;
int x=5,y=6;
public static void main(String args[])
{
int a; float b;
String S;
char c;
Scanner sc=new Scanner (System.in);
System.out.println("enter the value of a");
a=sc.nextInt();
System.out.println("enter the value of b");
b=sc.nextFloat();
System.out.println("enter the String");
S=sc.next();
c=sc.next().charAt(0);
System.out.println(a);
System.out.println(b);
System.out.println(s);
System.out.println(c);
System.out.println(S);
Variable obj=new Variable();
System.out.println(obj.x);
}
}

import java.util.*;
class AV
{
public static void main(String args[])
{
Double l,r,h,a1,a2,v1,v2;
Scanner sc=new Scanner(System.in);
System.out.println("enter the radius");
r=sc.nextDouble();
System.out.println("enter the height");
h=sc.nextDouble();
System.out.println("enter the slant height");
l=sc.nextDouble();
a1=4*3.14*r*r;
a2=3.14*r*(r+l);
v1=1/3*3.14*r*r*h;
v2=4/3*3.14*r*r*r;
System.out.println(a1);
System.out.println(a2);
System.out.println(v1);
System.out.println(v2);
}
}




import java.util.*;
class Ci
{
public static void main(String args[])
{
double p,r,n,Ci;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value p");
p=sc.nextDouble();
System.out.println("enter the value of n");
n=sc.nextDouble();
System.out.println("enter the value of r");
r=sc.nextDouble();
Ci=Math.pow(p*(1+r/100),(n)-1);
System.out.println(Ci);
}
}


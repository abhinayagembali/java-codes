import java.util.*;
class Copyarray
{
public static void main(String args[])
{
int n,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter the elements");
n=sc.nextInt();
int [] array1=new int[n];
for(i=0;i<n;i++)
{
array1[i]=sc.nextInt();
}
int [] array2=array.copyOf(array1,n);
for(i=0;i<n;i++)
{
System.out.println("elements of array2="+array2[i]);
}
}
}
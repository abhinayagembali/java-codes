import java.util.*;
class Matrixmulti
{
public static void main(String args[])
{
int a,b,c,i,j,k,r1,r2,c1,c2,n,m;
int a[][]=new int[n][m];
int b[][]=new int[n][m];
int c[][]=new int[n][m];
Scanner sc=new Scanner(System.in);
System.out,println("enter the number of rows and cols of the first matrix");
r1=sc.nextInt();
c1=sc.nextInt();
System.out.println("enter the elements of first matrix");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("enter the elements of second matrix");
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
b[i][j]=sc.nextInt();
}
}
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
c[i][j]=c[i][j]+a[i][k]*b[k][j];
}
}
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
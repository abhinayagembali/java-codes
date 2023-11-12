package operation.Successfull;
public class Armstrong
{
public void Check(int n)
{
int p=n;
int r,s;
s=0;
while(n!=0)
{
r=n%10;
s=s+(r*r*r);
n=n/10;
}
if(s==p)
{
System.out.print("armstrong");
}
else
{
System.out.print("not armstrong");
}
}
}
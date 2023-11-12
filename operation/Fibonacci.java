package operation;
public class Fibonacci
{
public void Fibo(int p)
{
int a,b,c;
a=0;
b=1;
System.out.print(a+"");
System.out.print(b+"");
while(p>(p-2))
{
c=a+b;
System.out.print(c);
a=b;
b=c;
p--;
}
}
}


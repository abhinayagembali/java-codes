import java.io.*;
class Buffer
{
public static void main(String[] args)throws IOException
{
int a,b,c;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the number of a");
a=Integer.parseInt(br.readLine());
System.out.println("enter the number of b");
b=Integer.parseInt(br.readLine());
c=a-b;
System.out.println(c);
}
}

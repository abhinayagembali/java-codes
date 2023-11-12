//questions
//1.WAJP to subtract the 2 nos by using command line argument.
//2.WAJP to implement the static varaibles,method and block.
//3.WAJP to sum of 5 numbers by using command line argument.
//4.WAJP to subtract of 2 numbers by using bufferedReader.
class Commandline
{
public static void main(String args[])
{
int a,b,c;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
c=a-b;
System.out.println("sub" +c);
}
}
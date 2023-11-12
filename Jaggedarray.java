class Jaggedarray
{
public static void main(String args[])
{
int arr[][]=new int[][];
arr[0]=new int[3];
arr[1]=new int[4];
arr[2]=new int[2];
int count=0;
for(i=0;i<arr.length;i++)
{
for(j=0;j<arr[i].length;j++)
{
a[i][j]=count++;
}
}
for(i=0;i<arr.length;i++)
{
for(j=0;j<arr[i].length;j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
}
}
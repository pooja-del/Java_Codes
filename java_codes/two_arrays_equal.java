import java.util.*;
import java.io.*;
class Sample{
public static void main(String[] args)
{
int a[]=new int [5];
int b[]=new int [5];
int i;
Scanner input=new Scanner(System.in);
for(i=0;i<a.length-1;i++)
{
System.out.println("Enter the elements of array a");
a[i]=input.nextInt();
}
System.out.print("The array elements are:");
for(i=0;i<a.length-1;i++)
{
System.out.print(a[i]);
}
for(i=0;i<b.length-1;i++)
{
System.out.println("Enter the elements of an array b");
b[i]=input.nextInt();
}
for(i=0;i<a.length-1;i++)
{
System.out.print(b[i]);
}
for(i=0;i<a.length-1;i++)
{
if(a[i]==b[i])
{
System.out.println("Two arrays are equal sample");
}
else
{
System.out.println("Two arrays are not equal");
}
}
}
}



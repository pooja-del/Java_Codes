import java.util.*;
import java.io.*;
import java.lang.*;
class solution7{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the size of the array...");
int n=input.nextInt();
String a[]=new String[n];
System.out.println("Enter the elements of the array");
input.nextLine();   //advances the scanner past the current line and returns the input that was skipped
for(int i=0;i<n;i++)
{
a[i]=input.nextLine();
}
for(int i=0;i<n;i++)
{
long l=Long.parseLong(a[i]);
System.out.println(a[i]+ "can be fitted in:");
if(l>-127 && l<128)
{
System.out.println("*byte \n *short \n *int \n *long");
}
else if(l>-32768 && l<32767)
{
System.out.println("*short \n *int \n *long");
}
else if(l>-2147483648 && l<2147483647)
{
System.out.println("*int \n *long");
}
else if(l>-9223372036854775808l && l<9223372036854775807l)
{
System.out.println("*long");
}
}
}
}

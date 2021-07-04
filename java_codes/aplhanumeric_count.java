import java.io.*;
import java.util.*;
class Solution{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the string value");
String s=scan.nextLine();
int i;
int count=0;
for(i=0;i<=s.length()-1;i++)
{
if(s.charAt(i)>=48 && s.charAt(i)<=122)
{
count++;
}
if(s.charAt(i)>57 && s.charAt(i)<65)
{
System.out.println("Ignore");
}
//if(s.charAt(i)>65 && s.charAt(i)<90)
//{
//System.out.println("Ignore");
//}
if(s.charAt(i)>90 && s.charAt(i)<97)
{
System.out.println("Ignore");
}
}
System.out.println(count);
}
}

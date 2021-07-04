import java.io.*;
import java.util.*;
class Solution{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter a string value");
String s=scan.nextLine();
//System.out.println(s.length());
int count=0;
for(int i=0;i<=s.length()-1;i++)
{
if(s.charAt(i)>=65 && s.charAt(i)<=122)
//&& s.charAt(i)>=97 && s.charAt(i)<=122)
{
count++;
}
if(s.charAt(i)>90&& s.charAt(i)<97)
{
System.out.println("Ignore");
}
}
System.out.println(count);
}
}

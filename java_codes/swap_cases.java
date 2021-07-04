import java.io.*;
import java.util.*;
class Solution{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the value of a string");
String s=scan.nextLine();
String s1="";
for(int i=0;i<=s.length()-1;i++)
{
char ch=s.charAt(i);
if(ch>='A' && ch<='Z')
{
s1=s.toLowerCase();
}
else if(ch>='a' && ch<='z')
{
s1=s.toUpperCase();
}
}
System.out.println(s1);
}
}


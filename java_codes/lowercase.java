import java.io.*;
import java.util.*;
class Solution{
public static void main(String[] args)
{
int count=0;
Scanner scan=new Scanner(System.in);
System.out.println("Enter a string value");
String s=scan.nextLine();
for(int i=0;i<=s.length()-1;i++)
{
if(s.charAt(i)>=97 && s.charAt(i)<=122)
{
count++;
}
}
System.out.println(count);
}
}



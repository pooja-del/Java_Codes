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
if(s.charAt(i)==' ')
{
//System.out.println(i);
count++;
}
}
System.out.println(count);
}
}


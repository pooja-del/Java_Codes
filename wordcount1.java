import java.io.*;
import java.util.*;
class Solution{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the string value");
String s=scan.nextLine();
int i,j;
int count=0;
int word_count=1;
for(i=0;i<=s.length()-1;i++)
{
if(s.charAt(i)==' ')
{
for(j=0;j<=count;j++)
{
word_count++;
}
}
}
System.out.println(word_count);
}
}


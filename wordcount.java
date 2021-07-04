import java.io.*;
import java.util.*;
class Two{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter the string value");
String s = scan.nextLine();
int i,j;
//char ch[i]=new char[2];
int count=1;
//int word_count=0;
for(i=0;i<=s.length()-1;i++)
{
if(s.charAt(i)==' ')
{
count++;
}
}
System.out.println(count);
}
}

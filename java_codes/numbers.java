import java.util.*;
import java.io.*;
class Solution{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
int count=0;
int i;
for(i=0;i<s.length()-1;i++)
{
if(s.charAt(i)>='0' && s.charAt(i)<='9')
{
count++;
}
}
System.out.println(count);
}
}


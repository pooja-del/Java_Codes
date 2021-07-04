import java.io.*;
import java.util.*;
class Solution{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
String S=scan.nextLine();
int count=0;
//one of the method to print vowels cons:can print only lower case letters;plz use switch statement
for(int i=0;i<=S.length()-1;i++)
{
if(S.charAt(i)=='a'||S.charAt(i)=='e'||S.charAt(i)=='i'||S.charAt(i)=='o'||S.charAt(i)=='u')
{
count++;
}
}
System.out.println(count);
}
}

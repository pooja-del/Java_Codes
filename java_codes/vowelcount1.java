import java.io.*;
import java.util.*;
class Solution{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
String S=scan.nextLine();
int count=0;
int j=0;
//one of the method to print vowels cons:can print only lower case letters;plz use switch statement
for(int i=0;i<=S.length()-1;i++)
{
char ch=S.charAt(i);
switch(ch)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
case 'A':
case 'E':
case 'I':
case 'O':
case 'U':j=1;
}
if(j==0)
{
count++;
}
}
System.out.println(count);
}
}


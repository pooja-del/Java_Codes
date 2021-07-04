import java.io.*;
import java.util.*;
class Solution
{
	public static void main(String[ ] arg)
	{
	String s;
	char ch;
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string : ");
	s=sc.nextLine();	
	System.out.println("consonanat in astring are"); 
	for(int j=0;j<s.length();j++)
	{
	ch=s.charAt(j);	
	if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
	{
	    System.out.print("");
	}
	else if(ch!=0)
	{
	    count++;
	}
	}
	System.out.println(count);
	}
}
	

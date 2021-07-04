import java.io.*;
import java.util.*;
class Solution{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter a string value");
String u=scan.nextLine();
for(int i=u.length()-1;i>=0;i--)
{
System.out.print(u.charAt(i));
}
}
}



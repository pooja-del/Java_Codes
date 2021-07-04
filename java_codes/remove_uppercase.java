import java.io.*;
import java.util.*;
class Solution{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter a string value");
String s=scan.nextLine();
s=s.replaceAll("[0-9]","");
System.out.println(s);
}
}

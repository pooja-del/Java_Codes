import java.io.*;
import java.util.*;
class Solution
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
s=s.replaceAll("[AaEeiIOouU]","");
System.out.println(s);
}
}

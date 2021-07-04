import java.io.*;
import java.util.*;
class main{
public static void main(String[] args)
{
//String u="TapAcademy";
Scanner input=new Scanner(System.in);
System.out.println("Enter the string");
String u=input.nextLine();
for(int i=0;i<=u.length()-1;i++)
{
System.out.println(u.charAt(i));
}
}
}

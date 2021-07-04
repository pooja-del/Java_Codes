import java.util.*;
import java.io.*;
class Coding3{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter a character:");
char s=input.next().charAt(0);
System.out.println("Entered charater is:" +s);
int x=(int)s;
System.out.println("The ASCII value is " + x);
}
}

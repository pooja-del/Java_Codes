import java.io.*;
import java.util.*;
class Solution{
public static void main(String[] args){
System.out.println("Enter three numbers :");
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
if(a>b && a>c)
{
System.out.println(a);
}
else if(b>c && b>a)
{
System.out.println(b);
}
else
{
System.out.println(c);
}
}
}




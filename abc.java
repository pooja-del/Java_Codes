import java.io.*;
import java.util.*;
class Solution{
public static void main(String[] args)
{
System.out.println("Enter the first number");
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
int div=0;
for(int i=1;i<=a && i<=b && i<=c ;i++)
{
if(a%i==0 && b%i==0 && c%i==0)     //a number which divides both the number which gives the remainder as 0
{
div=i;
}
}
System.out.println(div);
}
}


import java.io.*;
import java.util.*;
class Solutions{
public static void prime(int n)
{
int flag=0;
if(n==0||n==1)
{
System.out.println("It is not a prime number");
}
else
{
for(int i=2;i<n;i++)
{
if(n%i==0)
{
System.out.println("Non Prime number");
flag=1;
break;
}
}
if(flag==0)
{
System.out.println("Prime Number");
}
}
}
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int s=scan.nextInt();
prime(s);
}
}


import java.io.*;
import java.util.*;
class Solution{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int gcd=1;
int lcm=1;
for(int i=1;i<=a && i<=b;i++)
{
if(a%i==0 && b%i==0)
{
gcd=i;
}
}
System.out.println(gcd);
//int n1=scan.nextInt();
//int n2=scan.nextInt();
lcm=a*b/gcd;
System.out.println(lcm);
}
}



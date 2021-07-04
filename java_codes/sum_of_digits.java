import java.io.*;
import java.util.*;
class Solution{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int sum=0;
int rem=0;
int rem1=0;
int rem2=0;
int div=0;
int div1=0;
int div2=0;
int sum1=0;
for(int i=0;i<=n;i++)
{
div=n/1000;
rem=n%1000;
div1=rem/100;
rem1=rem%100;
div2=rem1/10;
rem2=rem1%10;
sum=div+div1+div2+rem2;
}
if(sum>=10)
{
sum1=sum/10+sum%10;
}
System.out.println(sum1);
}
}

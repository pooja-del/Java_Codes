import java.io.*;
import java.util.*;
class Solution{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
//int c=scan.nextInt();
int lcm=0;
for(int i=1;i<=a || i<=b ;i++)
{
if(a%i==0 && b%i==0)
{
lcm=((a/i)*(b/i));
}
}
System.out.println(lcm);
}
}



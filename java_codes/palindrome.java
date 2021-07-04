import java.io.*;
import java.util.*;
class Solution{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int rev=0;
int digit;
int n1=n;
while(n!=0)
{
digit=n%10;
rev=rev+digit;
n=n/10;
//flag=true;
}
System.out.println(rev);
if(n1==rev)
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}

import java.io.*;
import java.util.*;
class Solution{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int i;
//boolean flag=0;
for(i=1;i<=n;i++)
{
if(n%i==0)
{
System.out.println(i);
}
}
}
}



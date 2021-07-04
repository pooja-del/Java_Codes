import java.io.*;
import java.util.*;
class Solution{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int N=scan.nextInt();
int large=0;
int a[]=new int[N];
for(int i=0;i<=N-1;i++)
{a[i]=scan.nextInt();
}
for(int i=0;i<=N-1;i++)
{
if(large < a[i])
{
large=a[i];
}
}
System.out.println(large);
}
}

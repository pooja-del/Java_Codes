import java.io.*;
import java.util.*;
class Solution{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int N=scan.nextInt();
int sum=0;
for(int i=1;i<=N;i++)
{
sum=sum+i;
//sum=N*(N+1)/2;
}
System.out.println(sum);
}
}

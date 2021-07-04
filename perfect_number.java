import java.io.*;
import java.util.*;
class Solutions{
public static void perfect (int n)
{
int m=0;
for(int i=1;i<n;i++)
{
if(n%i==0)
{
m=i+i;
}
}
if(m==n)
{
System.out.println("It is a perfect number");
}
else{
System.out.println("It is not a perfect number");
}
}
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int s=scan.nextInt();
perfect(s);
}
}


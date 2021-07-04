import java.io.*;
import java.util.*;
class Solutions{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int x=scan.nextInt();
int n1=0,n2=1;
int x1=0;
for(int i=0;i<=x;i++)
{
x1=n1+n2;
n1=n2;
n2=x1;
System.out.println(n1);
}
}
}


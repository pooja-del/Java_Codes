import java.io.*;
import java.util.*;
class Solutions{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int i;
int num=0;
for(i=1;i<=n;i++)
{
num=i*(i+1)/2;
System.out.print(num);
}
}
}


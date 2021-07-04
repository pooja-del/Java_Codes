import java.io.*;
import java.util.*;
class Solutions{
public static void calFactors(int num)
{
int i;
for(i=1;i<=num;++i)
{
if(num%i==0)
{
System.out.println(i);
}
}
//eturn 0;
}
public static void main(String[] args)
{
int x=0;
Scanner Scan=new Scanner(System.in);
x=Scan.nextInt();
calFactors(x);
}
}


import java.io.*;
import java.util.*;
class Solutions{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int dec=scan.nextInt();
int bin[]=new int[1000];
int i=0;
while(dec>0)
{
bin[i]=dec%2;
dec=dec/2;
i++;
}
for(int j=i-1;j>=0;j--)
{
System.out.println(bin[j]);
}
}
}

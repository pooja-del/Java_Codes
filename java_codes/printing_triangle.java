import java.io.*;
class Triangle{
public static void main(String[] args)
{
int i,j;
for(i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println( );
}
int k,l;
for(k=1;k<=5;k++)
{
for(l=5;l>=k;l--)
{
System.out.print("*");
}
System.out.println( );
}
}
}

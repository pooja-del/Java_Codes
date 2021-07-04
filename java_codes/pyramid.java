import java.io.*;
class Pyramid{
public static void main(String[] args)
{
int i,j,k,l;
for(i=1;i<=5;i++)
{
for(k=7;k>=i;k--)
{
System.out.print("_");
}
for(j=1;j<=(i*2)-1;j++)
{
System.out.print("*");
}
for(l=7;l>=i;l--)
{
System.out.print("_");
}
System.out.println( );
}
}
}

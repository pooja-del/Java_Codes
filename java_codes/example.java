import java.io.*;
class Demo{
public static void main(String[] args)
{
int x=0;
int y=0;
for(int z=0;z<5;z++)
{
if((++x>2)&&(++y>2))
{
x++;
}
}
System.out.println(x + ""+y);
boolean b=true;
boolean c=false;
if(b)
{
System.out.println(b);
}
else
{
System.out.println(c);
}
}
}


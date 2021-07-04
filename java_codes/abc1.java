import java.io.*;
import java.util.*;
class main{
public static void main(String[] args)
{
int i;
int num=20;
for(i=1;i<=20;i++)
{
int div=num%i;
if(div==0)
{
System.out.println("\("+i+"\,"+num"\)");
}
else
{
System.out.println("This number will not divide 20");
}
}
}
}

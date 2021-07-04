import java.io.*;
import java.util.*;
class Method{
int x;
int y;
void add(int a)
{
x=a+1;
}
void add(int a,int b)
{
x=a+2;
}
public static void main(String[] args)
{
Method obj=new Method();
int a=0;
obj.add(6);
System.out.println(obj.x);
}
}


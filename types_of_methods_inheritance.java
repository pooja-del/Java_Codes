import java.io.*;
import java.util.*;
class Test1
{
int x,y;
Test1()
{
x=100;
y=200;
}
Test1(int x,int y)
{
super();
this.x=x;
this.y=y;
}
}
class Test2 extends Test1
{
int a,b;
Test2()
{
a=300;
b=400;
}
Test2(int a, int b)
{
super(a,b);
this.a=a;
this.b=b;
}
void disp()
{
System.out.println(x);
System.out.println(y);
System.out.println(a);
System.out.println(b);
}
}
class Demo
{
public static void main(String[] args)
{
Test2 t2=new Test2();
t2.disp();
}
}

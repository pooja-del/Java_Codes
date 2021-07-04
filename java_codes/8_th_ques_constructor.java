import java.io.*;
import java.util.*;
class Test1{
int a;
int b;
public static void main(String[] args)
{
Test1 t=new Test1();
System.out.println(t.add(10,20));
}
int add(int x,int y)
{
this.a=x;
this.b=y;
return this.a+this.b;
}
}

import java.io.*;
import java.util.*;
class Test{
Test(int x)
{
System.out.println(x);
}
}
class Demo
{
Test t=new Test(10);
Demo(int i)
{
System.out.println(i);
}
public static void main(String[] args)
{
Demo d=new Demo(5);
}
}

import java.io.*;
import java.util.*;
class Solution{
int num1;
int num2;
A(int num1)
{
this.num1=num1;
System.out.println("num1 :: "+(this.num1));
}
A(int num,int num2)
{
this(num);
this.num2=num2;
System.out.println("num2 ::"+(this.num2));
}
}
class Test1
{
public static void main(String[] args)
{
A a1=new A(4,5);
}
}


import java.io.*;
import java.util.*;
class Addition{
int a;
int area1(int l,int b)
{
return l*b;
}
double area2(int l,double b)
{
return l*b;
}
double area3(double l,double b)
{
return l*b;
}
float area4(float l,float b)
{
return l*b;
}
}
class Demo{
public static void main(String[] args)
{
Addition add=new Addition();
int m=10;
int b=30;
int result=add.area1(m,b);
System.out.println(result);
}				
}


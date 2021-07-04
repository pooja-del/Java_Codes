import java.io.*;
import java.util.*;
class Rectangle{
int a;
float add(int l,float b)
{
return l*b;
//return a;
}
double add(double l,double b)
{
return l*b;
//return a;
}
}
class Solution{
public static void main(String[] args)
{
int m=10,b=20;
Rectangle area=new Rectangle();
System.out.println(area.add(m,b));
}
}

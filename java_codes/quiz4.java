import java.io.*;
import java.util.*;
class area{
public int area1(int length,int breadth)
{
int area1=length*breadth;
}
public float area2(float length,int breadth)
{
float area2=length*breadth;
}
public float area3(int length,float breadth)
{
float area3=length*breadth;
}
//public int output()
//{
//return area1();
//}
public static void main(String[] args)
{
area a1=new area();
System.out.println(a1.area1(2,10));
}
}


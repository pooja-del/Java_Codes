import java.io.*;
import java.util.*;
class Circle{
float pi=3.14f;
float radius=3.2f;
double calculateArea()
{
double area=pi*radius*radius;
return area;
}
}
class Solution{
public static void main(String[] args)
{
Circle C=new Circle();
System.out.println(C.calculateArea());
}
}


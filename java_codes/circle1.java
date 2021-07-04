import java.io.*;
import java.util.*;
class Circle{
float pi=3.14f;
Scanner scan=new Scanner(System.in);
int radius=scan.nextInt();
float calculateArea()
{
float area=(pi*radius*radius);
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


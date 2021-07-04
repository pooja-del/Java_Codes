import java.util.*;
import java.io.*;
abstract class Shape{
float area;
abstract void acceptInput();
abstract void calcArea();
void dispOutput()
{
System.out.println(area);
}
}
class Circle extends Shape{
float radius;
void acceptInput()
{
System.out.println("Enter the radius of a circle:");
Scanner scan=new Scanner(System.in);
radius=scan.nextFloat();
}
void calcArea()
{
area=3.141f*radius*radius;
}
}
class Rectangle extends Shape{
float length;
float breadth;
void acceptInput()
{
System.out.println("Enter the length of a rectangle");
Scanner scan=new Scanner(System.in);
length=scan.nextFloat();
breadth=scan.nextFloat();
}
void calcArea()
{
area=length*breadth;
}
}
class Geometry{
void permit(Shape ref){
ref.acceptInput();
ref.calcArea();
ref.dispOutput();
}
}
class Demo{
public static void main(String[] args)
{
Circle r=new Circle();
Rectangle l=new Rectangle();
Geometry g=new Geometry();
g.permit(r);
g.permit(l);
}
}




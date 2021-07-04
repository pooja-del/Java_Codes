import java.io.*;
import java.util.*;
class Square{
Scanner Scan=new Scanner(System.in);
int side=Scan.nextInt();
int calculateArea()
{
int area=side*side;
return area;
}
}
class Solution{
public static void main(String[] args)
{
Square s=new Square();
System.out.println(s.calculateArea());
}
}


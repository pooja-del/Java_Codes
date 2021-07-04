import java.io.*;
import java.util.*;
interface First
{
void First()
{
System.out.println("hello");
}
void show();
}
class Test implements First{
public void show()
{
System.out.println("Hello");
}
public void main(String[] args)
{
Test t=new Test();
t.show();
}
}

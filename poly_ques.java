import java.io.*;
import java.util.*;
class Parent{
int a=20;
}
class Child extends Parent{
int a=30;
void show()
{
System.out.println(a);
System.out.println(super.a);
}
}
class Demo{
public static void main(String[] args)
{
Child c=new Child();
c.show();
}
}


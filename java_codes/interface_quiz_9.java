import java.io.*;
import java.util.*;
interface x
{
void f();
}
interface y extends x{
void g();
}
class C implements y{
public void f()
{
System.out.println("Hello");
}
public void g()
{
System.out.println("World");
}
}
class Sample{
public static void main(String[] args)
{
C o=new C();
o.g();
o.f();
}
}


import java.io.*;
import java.util.*;
class BooleanLocalvariable{
public void test()
{
boolean b1=true;
boolean b2=fix(b1);
System.out.println(b1+" " +b2);
}
public boolean fix(boolean b1)
{
b1=false;
return b1;
}
public static void main(String[] args)
{
BooleanLocalvariable b=new BooleanLocalvariable();
b.test();
}
}


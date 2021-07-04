import java.io.*;
import java.util.*;
class Calculator{
int num=100;
public void calc(int num)
{
num=num*10;
}
public void printNum(){
System.out.println(num);
}
public static void main(String[] args)
{
Calculator c1=new Calculator();
c1.calc(2);
c1.printNum();
}
}

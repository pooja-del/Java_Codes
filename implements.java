import java.io.*;
import java.util.*;
interface Calculator
{
void add();
void sub();
}
class Calculator1 implements Calculator
{
public void add()
{
int a=10;
int b=20;
int c=a+b;
System.out.println(c);
}
public void sub()
{
int a=12;
int b=10;
int c=a-b;
System.out.println(c);
}
}
class Calculator2 implements Calculator
{
public void add()
{
System.out.println("Enter a number");
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=a+b;
System.out.println("The addition of a number is:" +c);
}
public void sub()
{
System.out.println("Enter a number");
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=a-b;
System.out.println("The substraction of a number is" +c);
}
}
class Demo{
public static void main(String[] args)
{
Calculator1 mc1=new Calculator1();
Calculator2 mc2=new Calculator2();
mc1.add();
mc1.sub();
mc2.add();
mc2.sub();
}
}


import java.io.*;
import java.util.*;
class Demo1{
void fun1(){
System.out.println("Java");
}
}
class Demo2 extends Demo1{
void fun2(){
System.out.println("C");
}
}
class Demo3 extends Demo2{
void fun3(){
System.out.println("Python");
}
}
class Solution{
public static void main(String[] args)
{
Demo3 Car = new Demo3();
Car.fun1();
Car.fun2();
Car.fun3();
}
}

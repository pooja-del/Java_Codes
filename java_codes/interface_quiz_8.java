import java.io.*;
import java.util.*;
interface A
{
int x=10;
}
interface B
{
int x=100;
}
class Test implements A,B
{
public static void main(String[] args)
{
System.out.println(x);
}
}

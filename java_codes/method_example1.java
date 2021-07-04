import java.io.*;
import java.util.*;
class Solution
{
int a,b,c;
int add()
{
a=10;
b=20;
c=a+b;
return(c);
}
}
class Demo
{
public static void main(String[] args)
{
Solution ref=new Solution();
int result=ref.add();
System.out.println(result);
}
}


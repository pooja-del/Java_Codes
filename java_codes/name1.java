import java.io.*;
import java.util.*;
class Solution{
String name;     //if we are declaring instance variables;then inside the method;arguemnets shouldn't be given
String GetName()
{
return name;
}
}
class Demo{
public static void main(String[] args)
{
Solution ref=new Solution();
String S="Pooja";
ref.GetName(S);
System.out.println(ref.GetName(S));
}
}

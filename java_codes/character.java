import java.io.*;
import java.util.*;
class main{
public static void main(String[] args)
{
char c[]={'a','1','b',' ','A','0'};
for(int i=0;i<5;++i)
{
if(Character.isDigit(c[i]))
System.out.println("It s a digit");
if(Character.isWhitespace(c[i]))
System.out.println(c[i]+"It is a whitespace character");
if(Character.isUpperCase(c[i]))
System.out.println(c[i]+"is an uppercase letter");
if(Character.isLowerCase(c[i]))
System.out.println(c[i]+ "is a lower case letter");
i=i+3;
}
}
}


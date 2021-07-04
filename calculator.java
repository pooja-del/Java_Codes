import java.io.*;
import java.util.*;
class Solution{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n1=scan.nextInt();
int n2=scan.nextInt();
char c1=scan.next().charAt(0);
//char c[]={'+','-','*','/'};
int addition=n1+n2;
int sub=n1-n2;
int m=n1*n2;
int div=n1/n2;
switch(c1)
{
case '+':
{
System.out.println(addition);
}
break;
case '-':
{
System.out.println(sub);
}
break;
case '*':
{
System.out.println(m);
}
break;
case '/':
{
System.out.println(div);
}
break;
default :
System.out.println(addition);
}
}
}



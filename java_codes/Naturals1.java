import java.io.*;
import java.util.*;
class Gify{
int sum=0;
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int sumOfInteger()
{
while(n!=0)
{
sum=sum+n%10;
n=n/10;
}
return sum;
}
}
class Solutions{
public static void main(String[] args)
{
Gify g=new Gify();
System.out.println(g.sumOfInteger());
}
}

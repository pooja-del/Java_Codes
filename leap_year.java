import java.io.*;
import java.util.*;
class Solutions{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the year");
int x=scan.nextInt();
boolean leap;
if(x%4==0)
{
if(x%100==0)
   {
   if(x%400==0)
   leap=true;
   else
   leap=false;
   }
leap=true;  
}
else
{
leap=false;
}
if(leap==true)
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}

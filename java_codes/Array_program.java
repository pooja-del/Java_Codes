import java.io.*;
import java.util.*;
class Program1{
public static void main(String[] args)
{
int a[][]=new int[2][5];
int i,j;
Scanner scan=new Scanner(System.in);
for(i=0;i<=a.length-1;i++)
{
for(j=0;j<=a[i].length-1;j++)
{
System.out.println("Enter class name" +i+ "Student" +j);
a[i][j] = scan.nextInt();
}
}
System.out.print("Print array numbers");
for(i=0;i<=a.length-1;i++)
{
for(j=0;j<=a[i].length-1;j++)
{
System.out.println("The student in class are " +a[i][j]);
}
}
}
}


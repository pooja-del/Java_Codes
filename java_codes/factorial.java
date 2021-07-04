import java.io.*;
import java.util.*;
class Solution{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int fact=1;
for(int i=1;i<=n;i++)
{
fact=i*fact;
}
System.out.println(fact);
}
}


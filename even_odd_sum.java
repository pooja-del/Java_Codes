import java.io.*;
import java.util.*;
class Solutions{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int rem=0;
int count=0;
int sum_even=0;
int sum_odd=0;
int Diff=0;
while(n!=0)
{
rem=n%10;
n=n/10;
count++;
if(rem%2==0)
{
sum_even=sum_even+rem;
}
else
{
sum_odd=sum_odd+rem;
}
}
Diff=sum_even-sum_odd;
System.out.println(sum_even);
System.out.println(sum_odd);
System.out.println(Diff);
}
}

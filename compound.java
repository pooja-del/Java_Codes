import java.io.*;
import java.util.*;
class Solutions{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int P=scan.nextInt();
int R=scan.nextInt();
int t=scan.nextInt();
int n=scan.nextInt();
int A=(1+R/n);
int S=n*t;
double result=Math.pow(A,S);
double CI=P*result-P;
System.out.println(CI);
}
}

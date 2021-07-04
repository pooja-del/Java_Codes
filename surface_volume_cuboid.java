import java.io.*;
import java.util.*;
class Solutions{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
float l=scan.nextFloat();
float b=scan.nextFloat();
float h=scan.nextFloat();
float surface_area=2*(l*b+b*h+l*h);
float volume=l*b*h;
System.out.println(surface_area);
System.out.println(volume);
}
}


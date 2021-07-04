import java.io.*;
import java.util.*;
class box{
int width;
int height;
int volume;
int length;
void volume()
{
volume=length*width*height;
}
}
class output{
public static void main(String[] args)
{
box obj=new box();
obj.volume();
System.out.println(obj.volume());
}
}



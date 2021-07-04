import java.io.*;
import java.util.*;
class Plane{
void fly()
{
System.out.println("The plane can fly");
}
void takeoff()
{
System.out.println("The plane can take off");
}
void land()
{
System.out.println("The plane can land");
}
}
class CargoPlane extends Plane{
void fly()
{
System.out.println("The cargo plane can fly");
}
}
class FighterPlane extends Plane{
void fly()
{
System.out.println("The fighter plane can fly");
}
}
class Demo{
public static void main(String[] args)
{
Plane Pp=new Plane();
CargoPlane Cp=new CargoPlane();
FighterPlane Fp=new FighterPlane();
Pp.fly();
Pp.land();
Pp.takeoff();
Cp.fly();
Cp.land();
Cp.takeoff();
Fp.fly();
Fp.land();
Fp.takeoff();
}
} 

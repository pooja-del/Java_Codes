import java.io.*;
import java.util.*;
class plane{
void fly()
{
System.out.println("All planes can fly");
}
}
class CargoPlane extends plane{
void fly()
{
System.out.println("It flies slower");
}
void ThingsCarried()
{
System.out.println("It carries cargo");
}
}
class PassengerPlane extends plane{
void fly()
{
System.out.println("It flies faster than cargoplane");
}
void ThingsCarried()
{
System.out.println("It carries passengers");
}
}
class FighterPlane extends plane{
void fly()
{
System.out.println("It flies faster than passengerplane");
}
void ThingsCarried()
{
System.out.println("It carries weapons");
}
}
class Demo{
public static void main(String[] args)
{
plane ref=new plane();
CargoPlane Cp=new CargoPlane();
PassengerPlane Pp=new PassengerPlane();
FighterPlane Fp=new FighterPlane();
//plane ref;
ref=Cp;
ref.fly();
((CargoPlane)(ref)).ThingsCarried();
ref=Pp;
ref.fly();
((PassengerPlane)(ref)).ThingsCarried();
ref=Fp;
ref.fly();
((FighterPlane)(ref)).ThingsCarried();
}
}

import java.io.*;
import java.util.*;
abstract class Bird{
abstract void eat();
abstract void fly();
}
class Eagle extends Bird{
void fly()
{
System.out.println("It flies at great heights");
}
}
class SerpentEagle extends Eagle{
void eat()
{
System.out.println("Serpent Eagle eats by hunting over mountains");
}
}
class GoldenEagle extends Eagle{
void eat()
{
System.out.println("Golden eagle eats golds");
}
}
class Behaviour
{
void permit(Eagle ref)
{
ref.eat();
ref.fly();
}
}
class Demo
{
public static void main(String[] args)
{
SerpentEagle se=new SerpentEagle();
GoldenEagle ge=new GoldenEagle();
Eagle e=new Eagle();
se.eat();
//ge.eat();
//se.fly();
//ge.fly();
e.permit(se);
e.permit(ge);
}
}

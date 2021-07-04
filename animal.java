import java.io.*;
import java.util.*;
class Animal{
void eat()
{
System.out.println("Animal eats");
}
void sleep()
{
System.out.println("aNIMAL SLEEPS");
}
void FoodHabit()
{
System.out.println("Different animal exhibits different ffod habits");
}
}
class Deer extends Animal{
void eat()
{
System.out.println("Deer eats carrot");
}
void sleep()
{
System.out.println("Deer SLEEPS on grass");
}
void FoodHabit()
{
System.out.println("Deer are Harbibores");
}
}
class Tiger extends Animal{
void eat()
{
System.out.println("Tiger eats crocodile");
}
void sleep()
{
System.out.println("TIger SLEEPS in cave");
}
void FoodHabit()
{
System.out.println("Tiger are Carnivores");
}
}
class Monkey extends Animal{
void eat()
{
System.out.println("Monkey eats carrot");
}
void sleep()
{
System.out.println("Monkeys SLEEP on Trees");
}
void FoodHabit()
{
System.out.println("Monkeys are omnibores");
}
}
class Forest
{
void permit(Animal ref)
{
ref.eat();
ref.sleep();
ref.FoodHabit();
}
}
class Solution{
public static void main(String[] args)
{
Deer d=new Deer();
Tiger t=new Tiger();
Monkey m=new Monkey();  //runtime polymorphism reduces code complexity which in turn reduces code length and space
Forest f=new Forest();
f.permit(d);
f.permit(t);
f.permit(m);
}
}


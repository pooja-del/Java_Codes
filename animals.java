import java.io.*;
import java.util.*;
class Animal{
void eat()
{
System.out.println("The animals can eat");
}
void breathe()
{
System.out.println("The animals can breathe");
}
void foodHabit()
{
System.out.println("The animals food habits are Herbibores,carnibores and omnibores");
}
}
class Deer extends Animal{
void foodHabit()
{
System.out.println("Deer are herbibores");
}
void Feature()
{
System.out.println("Deer have horns");
}
}
class Tiger extends Animal{
void foodHabit()
{
System.out.println("Tigers are carnibores");
}
void Feature()
{
System.out.println("Tigers have yellow print");
}
}
class Monkey extends Animal{
void foodHabit()
{
System.out.println("Monkeys are omnibores");
}
void Feature()
{
System.out.println("Monkeys have long tail");
}
}
class Demo{
public static void main(String[] args)
{
Animal a=new Animal();
Deer d=new Deer();
Tiger t=new Tiger();
Monkey m=new Monkey();
a.eat();
a.breathe();
a.foodHabit();
d.eat();
d.breathe();
d.foodHabit();
d.Feature();
t.eat();
t.breathe();
t.foodHabit();
t.Feature();
m.eat();
m.breathe();
m.foodHabit();
m.Feature();
}
}



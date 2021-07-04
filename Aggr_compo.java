import java.io.*;
import java.util.*;
class Heart{
private int weight;
private int bpm;
Heart(int weight,int bpm)
{
this.weight = weight;
this.bpm=bpm;
}
int getWeight()
{
return weight;
}
int getBpm()
{
return bpm;
}
}
class Brain{
private int weight;
private String Color;
Brain(int weight,String Color)
{
this.weight=weight;
this.Color=Color;
}
int getWeight()
{
return weight;
}
String getColor()
{
return Color;
}
}
class Bike{
private int mileage;
private String Brand;
Bike(int mileage,String Brand)
{
this.mileage=mileage;
this.Brand=Brand;
}
int getMileage()
{
return mileage;
}
String getBrand()
{
return Brand;
}
}
class Book{
private String name;
private String author;
Book(String name,String author)
{
this.name=name;
this.author=author;
}
String getName()
{
return name;
} 
String getAuthor()
{
return author;
}
}
class Student{
Heart h=new Heart(289,72);
Brain b=new Brain(1400,"Pink");
void hasA(Bike bi)
{
System.out.println(bi.getMileage());
System.out.println(bi.getBrand());
}
void hasA(Book bo)
{
System.out.println(bo.getName());
System.out.println(bo.getAuthor());
}
}
class Launch{
public static void main(String[] args)
{
Student s=new Student();
Bike bike=new Bike(25,"KTM");
Book book=new Book("The Secret","Rhonde Byrne");
System.out.println(s.h.getWeight());
System.out.println(s.h.getBpm());
System.out.println(s.b.getWeight());
System.out.println(s.b.getColor());
s.hasA(bike);
s.hasA(book);
s=null;
}
}


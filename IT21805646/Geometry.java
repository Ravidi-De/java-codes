//Question 01

public class Geometry{

public static void main(String[]args){

public static double getAreaOfCircle(int radius){
return(3.14*radius*radius);}

public static double getAreaOfRectangle(int length,int width){
return(length*width);}

public static double getAreaOfTriangle(int base,int height){
return(0.5*base*height);}
 }
}

public class Demo{

public static void main(String[]args){

System.out.println("1.Calculate the Area of a Circle");
System.out.println("2.Calculate the Area of a Rectangle");
System.out.println("3.Calculate the Area of a Triangle");
System.out.println("4.Quit");
System.out.println("Enter your choice(1-4)");

Scanner sc=new scanner(system.in);
int choice=sc nextInt();

switch(choice){
case 1:
System.out.println("please enter the radius of the circle:");
int radius=sc.nextInt();
System.out.println("the area of circle is:"+getAreaOfCircle(radius));
break;

case 2:
System.out.println("please enter the length of the rectangle:");
int length=sc.nextInt();
System.out.println("please enter the width of the circle:");
int width=sc.nextInt();
System.out.println("the area of rectangle is:"+getAreaOfRectangle(length,width));
break;

case 3:
System.out.println("please enter the base of the Triangle:");
int base=sc.nextInt();
System.out.println("please enter the height of the circle:");
int height=sc.nextInt();
System.out.println("the area of triangle is:"+getAreaOfTrianglele(base,height));
break;

default:
System.out.println("Do you need to continue(Y/N)");
System.out.println("Thank You!!!");
 }
}

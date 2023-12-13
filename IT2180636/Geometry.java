                                                    //Question 1
public class Geometry{
public static double getAreaOfCircle(double radius){
	
	double area;
    area = 3.14 * radius * radius; 
    return area;
}
	
public static double getAreaOfRectangle(double L, double w){
    double area;
    area = L*w;
    return area;
}

public static double getAreaOfTrangle(double Base,double h){
    double area;
    area = 0.5* Base*h;
    return area;              
} 

import java.util.Scanner;
public class Demo{
public static void main(String[] args){
Geometry geo = new Geometry();
  
  while(number <0 || number>4){
	  
	  System.out.println("1.Calculate the Area of a Circle");
      System.out.println("2.Calculate the Area of a Rectangle");
      System.out.println("3.Calculate the Area of a Triangle");
      System.out.println("4.Quit");
	  System.out.println("Enter your choice (1-4)");
	  
	  
   
      
	  number=sc.nextInt();
  }
  switch(number){         
	  case 1:
	  System.out.println("Enter the radius of circle: ");
	  double radius = sc.nextDouble();
	  System.out.println("");
	  System.out.println("Area"+geo.getAreaOfCircle(radius));
	  break;
	  
	  case 2:
	  System.out.println("Enter lenth");
	  double Length=sc.nextDouble();
	  System.out.println("Enter Width");
	  double Width=sc.nextDouble();
	  System.out.println("Area"+get.getAreaOfTrangle(Length,Width));
	  break;
	  
	 case 3:
	  System.out.println("Enter Base:");
	  double base= sc.nextDouble();
	  System.out.println("Enter Height:");
	  double Height=sc.nextDouble();
	  System.out.println("Area"+get.getAreaOfTrangle(Base,Height));
	  break;
	  
	 default: 
  }
     System.out.println("Do You Need to continue (Y/N)");
	 String p=sc.next();
	 
	 
}



  
  





	
	
		
	  
	  
	  
	  
	  
	  
	  
  

  

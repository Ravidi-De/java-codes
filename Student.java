import java.util.Scanner;
class Student{

    public static void main(String[] args){
	   Scanner sc= new Scanner(System.in);
	   
	   System.out.println("Enter your age");
	   int age =sc.nextInt(); //camel notation
	   
	   System.out.println("Enter your name ");
	   String name=sc.next();
	   
	   System.out.println("Your Age Is:"+ age);
	   System.out.println("Your Name Is:"+ name);
	   
	   if(age>=60){
		   System.out.println("Old Person");
	   }else if(age<60 && age>20){
		   System.out.println("Young");
	   }else{
		   System.out.println("Baby");
	   }
	             
	   
	   
	   
	   
	   
	
	}
	
   }
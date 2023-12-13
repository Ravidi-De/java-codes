import java.util.Scanner;
class Exam{
     
	 char calculate (String index_Number,int marks){  //method creation
	 
	 char grade;
	 
	 if(marks>=75){
	    grade='A';
	  }else if(marks<75 && marks>=50){
	    grade='B';
	  }else{
	    grade='C';
	  }
	  
	  return grade;
}

public static void main(String[] args){

 Scanner sc=new Scanner(System.in);
 
 System.out.println("Enter Student Index_Number:");
 String index_Number=sc.next();
 
 
 System.out.println("Enter Student Marks:");
 int marks=sc.nextInt();
 
 Exam object= new Exam();
 char grade= object.calculate(index_Number,marks);
 
 System.out.println("Grade Is = "+grade);
 
 
	   
}
}
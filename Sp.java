import java.util.Scanner;
class Sp{
   public static void main (String[] args){
   
   Scanner sc= new Scanner(System.in);
  
    
   for(int i=0; i<5;i++){
	  System.out.println("Enter Your Number :");
      int number= sc.nextInt();
	   
    if(number%2==1){
     System.out.println("Odd Number");
    }else{
     System.out.println("Even Number");
    }
   }
   
   
   
   }

}
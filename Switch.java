import java.util.Scanner;
class Switch{
	
  int calculate (int number_1,int number_2,String op){
	  
	int result=0;
  switch (op){
  
   case "+" : result =number_1 + number_2; break;
   case "-" : result =number_1 - number_2; break;
   case "/" : result =number_1 / number_2; break;
   case "*" : result =number_1 * number_2; break;
   
   default:
    System.out.println("Invalid Operator");
	}
	return result;
	  
	}
	 
	 
	public static void main(String[] args){
	  
	  Scanner sc=new Scanner(System.in);
	  
	  for(;;){
	  System.out.println("Do You Want To Continue (Yes- Y / No- N)");
	  char responce= sc.next().charAt(0);  /*first index*/
	  
	  if (responce=='Y'){
	  
   
       System.out.println("Enter Your Number 1");
       int number_1=sc.nextInt();
  
       System.out.println("Enter Your Operator");
       String op=sc.next();     //nextLine=string
  
       System.out.println("Enter Your Number 2");
       int number_2=sc.nextInt();
	   
	   Switch object= new Switch();
	   int result = object.calculate( number_1,number_2,op);
	   
	   System.out.println("Result is ="+result);
	   
	   
	  
	   
	  }
	  
	  else{break;
		 
	 }
	  
	  
  }
}

}
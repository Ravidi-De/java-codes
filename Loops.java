class Loops{
public static void main(String []args){
    
	for(int i=10;i>0;i--)
	  {
	  System.out.println(i);
	  }
	  System.out.println(" ");
	  System.out.println(" ");
	  
	 int i=10;
	 while(i>0){
	   System.out.println(i);
	   i--;
	   }
	  System.out.println(" ");
	  System.out.println(" ");
	  
	  int j=5;
	  do{
		  System.out.println(j);
		  j-- ;
		}while(j>0);
		
	  System.out.println(" ");
	  System.out.println("Inner Loop Demo ");
	  
	  for(int a=1;a<10;a++)/*number of lines*/{
		  for (int b=1;b<10;b++)/*line items*/{
			  
			  System.out.print("*");
		  
		 }
		 System.out.println(" ");
	  }
	    	
	  
 }
  

}
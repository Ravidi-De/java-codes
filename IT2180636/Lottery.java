import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Lottery{
	Random RanNum = new Random();
	int LotteryNumbers = new int[5];
	
	Lottery() {
		for (int i=0;i<LotteryNumbers.length;i++)
		{
			LotteryNumbers[i]=RanNum.nextInt(bound:9);
		}
	}
	public int compareLottery(int[] myNumbers){
		int count=0;
		
		Arrays.sort(LotteryNumbers);
		Arrays.sort(myNumbers);
		
		for (int j=0; j<lotteryNumbers.length;j++)
		{
			for(int x=0; x<myNumbers.length;x++){
				
				if(lotteryNumbers[j]==myNumbers[x]){
					
					LotteryNumbers[j]= -1;
					myNumbers[x]= -1;
					
					count++;
					break;
				}
			}
		    }	
			return count;
	}



	public int getLotteryNumbers(int i){
		return LotteryNumbers[i];
	}




	public  static void main(String[] args)
	{
		
		Lottery LOTTERY = new lottery();
		Scanner GetNum = new Scanner(System.in);
		
		int[] GETNumbers =  new  int [5];
		
		for (int i=0;i<GetNumbers.length;i++){
			System..out.println("Enter the Number"+(i+1)+);
			GetNumbers[i]=GetNum.nextInt();
			
		}
		
		int Gnum1=LOTTERY.getLotteryNumbers(i:0);
		int Gnum1=LOTTERY.getLotteryNumbers(i:1);
		int Gnum1=LOTTERY.getLotteryNumbers(i:2);
		int Gnum1=LOTTERY.getLotteryNumbers(i:3);
		int Gnum1=LOTTERY.getLotteryNumbers(i:4);
		
		System.out.println(k:"Lottery Values are");
		System.out.println(+Gnum1+"\t" +Gnum2+"\t"+ Gnum3+"\t"+Gnum4+"\t");
		
		System.outprintln(k:"User Values are");
		System.out.println(+GetNumbers[0]+"\t" +GetNumbers[1]+"\t"+ GetNumbers[2]");
		
		int result = LOTTERY.CompareLottery(GETNumbers);
		
		System.out.println("Number Of matching entries are :"+result);
	}
	
}
		
		
		
				


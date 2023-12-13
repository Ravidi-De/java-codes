//Question 02

public class Lottery{

public static void main(String[]args){

int[] lotteryNumbers = new int[5];

Random rn=new random();

for (int x=0;x<lotteryNumbers;x==){
lotteryNumbers[x]=rn.nextInt(9);}
}

public int compareLottery(int[]personNumbers){

int count=0;

Arrays.sort(lottaryNumbers);
Arrays.sort(personNumbers);

for(int y=0;y<lotteryNumbers;y++){
for(int j=0;j<personNumbers;j++){

if(lotteryNumbers[y]==personNumbers[j]){

lotteryNumbers[y]=-1;
personNumbers[j]=-1;

count++;

break;
}
}

return count;
}

public int getLotteryNumbers(int x){
return lotteryNumbers[x];
}

System.out.println("Enter the Numbers"+(x+1));
GetNumbers[x]=GetNum.nextInt();}
 
int GetNum1=Lottry.getLotterynumbers(x:0);
int GetNum2=Lottry.getLotterynumbers(x:1);   
int GetNum3=Lottry.getLotterynumbers(x:2);
int GetNum4=Lottry.getLotterynumbers(x:3);
int GetNum5=Lottry.getLotterynumbers(x:4);

System.out.println("Lottery Values are");
System.out.println("GetNum1+"\t"+GetNum2+"\t"+GetNum3+"\t"+GetNum4+"\t"+GetNum5+"\t");

System.out.println("User Values are");
System.out.println("GetNumbers[0]+"\t"+GetNumbers[1]+"\t"+GetNumbers[2]+"\t"+GetNumbers[3]+"\t"+GetNumbers[4]+"\t"+");

int result=Lottery.CompareLottery(GetNumbers);

System.out.println("Numbers of Matching Entries are"+result);
}
}
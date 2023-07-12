package Programs;
import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int Num = sc.nextInt();
		int oldNum =Num;
		int Rev = 0;
		while(Num!=0)
		{
			Rev=Rev*10 + Num%10; 
			Num=Num/10;
		}
		System.out.println("Reverse Digits  :" + Rev);
		
		if (oldNum == Rev)
		{
			System.out.println("Panlidrom number");
		}
		else
		{
			System.out.println("not Panlidrom number");
		}
	}

	
}

package Programs;

import java.util.Scanner;

public class Sumnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC= new Scanner(System.in);
		System.out.println("Enter number ");
		int num = SC.nextInt();
		
		int sum =0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("Sum : "+sum);
	}

}

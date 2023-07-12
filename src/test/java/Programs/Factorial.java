package Programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Digits ");
		Scanner In = new Scanner(System.in);
		int GivenNum = In.nextInt();
		
		
		int fact=1;
		
		for(int i=1;i<=GivenNum; i++)
		{
			fact = fact * i; // 1
		}
		System.out.println(fact);
	}

}

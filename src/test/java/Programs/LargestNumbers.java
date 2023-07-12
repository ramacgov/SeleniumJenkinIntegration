package Programs;

import java.util.Scanner;

public class LargestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Number1 ");
		Scanner In1 = new Scanner(System.in);
		int A = In1.nextInt();
		
		System.out.println("Enter number2 ");
		Scanner In2 = new Scanner(System.in);
		int B = In2.nextInt();
		
		System.out.println("Enter number3 ");
		Scanner In3 = new Scanner(System.in);
		int C = In3.nextInt();

		
		if (A>B && A>C)
		{
			System.out.println("Big Numberis A");
		}
		
		else if (B>A && B>C)
		{
			System.out.println("Big Numberis B");
		}
		else
		{
			System.out.println("Big Numberis C");
		}
	}

}

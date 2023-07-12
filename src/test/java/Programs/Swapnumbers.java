package Programs;

import java.util.Scanner;

public class Swapnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number1 ");
		Scanner In1 = new Scanner(System.in);
		int GivenNum1 = In1.nextInt();
		
		System.out.println("Enter number2 ");
		Scanner In2 = new Scanner(System.in);
		int GivenNum2 = In2.nextInt();
		
		//using with temp variable
		
		System.out.println("Before Swap "+ GivenNum1 +""+GivenNum2 );
		
		int Temp  = GivenNum1;
		GivenNum1 = GivenNum2;
		GivenNum2 = Temp;
		
		System.out.println("After Swap "+ GivenNum1 +""+GivenNum2 );
		
		//using with out temp variable
		
		System.out.println("Enter Number1 ");
		Scanner In3 = new Scanner(System.in);
		int X = In3.nextInt();
		
		System.out.println("Enter number2 ");
		Scanner In4 = new Scanner(System.in);
		int Y = In4.nextInt();
		
		System.out.println("Before Swap "+ X +""+Y );
		
		X =X + Y;
		Y =X - Y;
		X =X - Y;
		
		System.out.println("Before Swap "+ X +""+Y );
		
		
		
		
				
		
		
		

	}

}

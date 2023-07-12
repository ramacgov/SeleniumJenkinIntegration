package Programs;

import java.util.Scanner;

public class Numberofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int Num = sc.nextInt();
		
		int count=0;
		
		while (Num>0)
		{
			Num=Num/10;
			System.out.println(Num);
			count++;
		}
		System.out.println(count);
	}

}

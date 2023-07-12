package Programs;

import java.util.Scanner;

public class Evenoddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Digits ");
		Scanner In = new Scanner(System.in);
		int GivenNum = In.nextInt();
		
		int Evennum=0;
		int oddnum=0;
		
		while(GivenNum>0)
		{
			int remainder = GivenNum%10;
			
			if (remainder%2==0)
			{
				Evennum++;
			}
			else
			{
				oddnum++;
			}
			
			GivenNum=GivenNum/10;
		}
		
		System.out.println(" No of Even Numners "+Evennum);
		System.out.println(" No of odd Numners "+oddnum);
	}

}
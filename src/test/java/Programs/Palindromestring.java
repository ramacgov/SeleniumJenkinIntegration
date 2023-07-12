package Programs;
import java.util.Scanner;

public class Palindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string ");
		String str =sc.next();
		String OrgStr = str;
		
		int strlen=OrgStr.length();
		System.out.println(strlen);
		
		String strrev="";
		
		for(int j=strlen-1;j>=0;j--)
		{
			strrev=strrev+str.charAt(j);
		}
		System.out.println(strrev);
		if(strrev.equals(OrgStr))
		{
			System.out.println("Palidrome");
		}
		else
		{
			System.out.println("not a Palidrome");
		}
		
		

	}

}

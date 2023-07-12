package Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.ListIterator.*;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string ");
		String strname =sc.next();
		
		  StringBuilder str2 =new StringBuilder(); 
		  str2.append(strname); 
		  str2 = str2.reverse(); 
		  System.out.println("StringBuilder-Before reverse  " +strname); 
		  System.out.println("StringBuilder-After reverse  " + str2);
		  
		  char[] chrarr=strname.toCharArray(); 
		  String strrev=""; 
		  for(int  i=chrarr.length-1;i>=0;i--) 
		  { 
			  
			strrev=strrev+chrarr[i]; }
		  System.out.println("\n"); 
		  System.out.println("Using Char[]-Before reverse  " + strname); System.out.println("Using Char[]-After reverse  \"" +strrev);
		 
		
		char[] array=strname.toCharArray();
		List<Character> lists=new ArrayList<Character>();
		for (Character character : array)
		{
			lists.add(character);
		}
		
		Collections.reverse(lists);
		
	ListIterator iterator = lists.listIterator();
	
	System.out.println("Using collection");
	
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
		
		
	}
}

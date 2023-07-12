package Programs;

public class Arrayevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3,8,2,5,7,1,6};
		
		System.out.println("Even nos in the array ");
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
			
		}
		
System.out.println("Odd nos in the array ");
		
		for(int k=0;k<a.length;k++)
		{
			if(a[k]%2!=0)
			{
				System.out.println(a[k]);
			}
			
		}

	}

}

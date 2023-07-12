package Programs;

public class MissingNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,4,5};
		
		int sum = 0;
		int sum1 =0;
		
		for (int j=0;j<a.length;j++)
		{
			sum = sum + a[j];
		}
		System.out.println(sum);
		
		for (int j=1;j<=5;j++)
		{
			sum1 = sum1 + j;
		}
		System.out.println(sum1);
		System.out.println(sum1-sum);

	}

}

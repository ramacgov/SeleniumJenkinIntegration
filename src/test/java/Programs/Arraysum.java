package Programs;

public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {5,2,3,7,9};
		
		int sum = 0;
		
		for (int j=0;j<a.length;j++)
		{
			sum = sum + a[j];
		}
		System.out.println(sum);
	}

}

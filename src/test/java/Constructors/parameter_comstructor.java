package Constructors;

class Bike2{ 
	int c,d,e;
	//creating a default constructor  
	Bike2(int a,int b)
	{
		c= a;
		d= b;
		e=c+d;
		System.out.println(e);
		}  
	//main method  
	public static void main(String args[]){  
	//calling a default constructor  
	Bike2 b=new Bike2(1,2);
	}  
	}  

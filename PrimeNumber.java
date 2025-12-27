package TestJavaProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=isPrime(1229);
		
		if(flag==true) {
			System.out.println("No is prime number");

		}
		else
		{
		System.out.println("No is not prime number");
		}

	}
	public static boolean isPrime(int n)
	{
		//int num = n;
		boolean flag=false;
		if(n==0||n==1)
		{
		flag=false;
		}
		if(n==2)
		{
			flag=true;
		}
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				flag=false;
			}
			else 
				flag=true;
		}
		
		return flag;
	
		
	}

}

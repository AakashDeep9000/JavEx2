package main;

public class Factorialrange {
	public static long[] factoring(int n) {
		long[] arr=new long[20];
		for(int i=1;i<=n;i++)
		{
			long fact=1;
			for(int j=1;j<=i;j++)
			{
				fact*=j;
			}
			
			if(fact<=Integer.MAX_VALUE)
			{
			System.out.println("The factorial of "+i+" is "+fact);
			arr[i-1]=fact;
			}
			else
			{
			System.out.println("The factorial of "+i+" is out of range");	
			}
		}
		return arr;
	}
}

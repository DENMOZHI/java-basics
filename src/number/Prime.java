package number;

import java.util.Scanner;

public class Prime {
	public static void main(String[]args)
	{
		int i = 2;
		boolean isPrime=true;
		Scanner Scan=new Scanner(System.in);
		int num=Scan. nextInt();
		Scan.close();
		while(i<=num/2)
		{
		if(num%i==0)
		{
	      isPrime = false;
	      break;
		}
		i++;
		}
		if(isPrime)
			System.out.println(num+"is a primeNumber");
		else
		    System.out.println(num+"is not a primeNumber");
			
		}
}

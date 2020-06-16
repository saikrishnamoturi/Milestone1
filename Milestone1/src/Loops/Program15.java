package Loops;
//program to print the sum of all the digits of a given number.
public class Program15 {
	public static void main(String args[])
	{
		int m=Integer.parseInt(args[0]);
		int n,sum=0;
		while(m>0)
		{
			n=m%10;
			sum+=n;
			m=m/10;
		}
		System.out.println("Sum of digits is: "+sum);
	}
}

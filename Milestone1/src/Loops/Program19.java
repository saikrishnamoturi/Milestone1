package Loops;
//program to print first 5 values which are divisible by 2, 3, and 5
public class Program19 {
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int val=Integer.parseInt(args[3]);
		int n,i=1;
		n=a*b*c;
		while(i<=val)
		{
			System.out.println(n*i);
			i++;
		}
	}
}

package Loops;
//Program to reverse a given number.
public class Program17 {
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		int reverse=0;
		while(num!=0)
		{
			reverse=reverse*10+(num%10);
			num=num/10;
		}
		System.out.println(reverse);
	}
}

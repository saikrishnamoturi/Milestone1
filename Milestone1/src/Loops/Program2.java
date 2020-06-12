package Loops;
//program to check given number is odd or even
public class Program2 {
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		if(a%2==0)
		{
			System.out.println(a+" is even");
		}
		else 
		{
			System.out.println(a+"is odd");
		}
	}
}

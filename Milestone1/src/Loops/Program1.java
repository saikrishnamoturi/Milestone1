package Loops;
//program to check if a given integer number is Positive, Negative, or Zero
public class Program1 {
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		if(a>0)
		{
			System.out.println("Number is positive");
		}
			else if (a< 0) {
				System.out.println("Number is negative");
			}
			else {
				System.out.println("Number is zero");
			}
		}
	}

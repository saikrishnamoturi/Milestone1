package Loops;
//program to print * in Floyds format (using for and while loop)
public class Program16 {
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print("* ");
		}
			System.out.print("\n");
	}
}
}

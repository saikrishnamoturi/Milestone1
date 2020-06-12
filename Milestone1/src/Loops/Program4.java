package Loops;
//Initialize two character variables in a program and display the characters in alphabetical order
public class Program4 {
	public static void main(String args[])
	{
		char alphabet1=args[0].charAt(0);
		char alphabet2=args[1].charAt(0);
		if((int)alphabet1>(int)alphabet2)
			System.out.print(alphabet2+", "+alphabet1);
		else
			System.out.print(alphabet1+", "+alphabet2);
	}
}

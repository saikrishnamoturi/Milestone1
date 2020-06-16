package Loops;
//Palindrome
public class Program18 {
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		int temp=0,reverse=0;
		temp=num;
		while(temp!=0)
		{
			reverse=reverse*10+(temp%10);
			temp=temp/10;
		}
		if(num==reverse)
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
	}
}

package Loops;

public class Program5 {
	public static void main(String args[])
	{
		char ch=args[0].charAt(0);
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println(ch+" is Alphabet");
		}
		else if(ch>='0'&&ch<='9')
		{
			System.out.println(ch+" is Digit");
		}
		else
		{
			System.out.println(ch+" is special Character");
		}
	}
}

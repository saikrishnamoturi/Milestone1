package Loops;
//If the character value is in lowercase, the output should be displayed in uppercase
public class Program7 {
	public static void main(String args[])
	{
		char alpha=args[0].charAt(0);
		if(alpha>='a'&&alpha<='z') {
			alpha-=32;
			}
			else if(alpha>='A'&&alpha<='Z') {
				alpha+=32;
			}
		System.out.println(alpha);
		}
	}

package Loops;
//program to check if the program has received command line arguments or not
public class Program3 {
	public static void main(String args[])
	{
		if(args.length==0)
		{
			System.out.println("No values");
		}
		else {
			int i;
		for(i=0;i<args.length-1;i++)
		{
			System.out.print(args[i]+",");
		}
		System.out.println(args[i]);
		}
	}
}

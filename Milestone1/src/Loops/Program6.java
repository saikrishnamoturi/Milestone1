package Loops;
//Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.
public class Program6 {
	public static void main(String args[])
	{
		String gender=args[0];
		int age=Integer.parseInt(args[1]);
		 if(gender.equals("Female"))
		 {
			 if(age>=1&&age<=59)
				 System.out.println("Intrest=8.2%");
		 else if(age>=59&&age<=100)
			 System.out.println("Intrest=9.2%");
		 }
		 else {
			 if(age>=1&&age<=60) {
				 System.out.println("Intrest=9.2%");
				  if(age>60&&age<=120)
					 System.out.println("Intrest=8.3%");
			 }
		 }
	}
}

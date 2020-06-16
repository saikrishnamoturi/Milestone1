package Loops;

public class Program14 {
	public static void main(String args[])
	{
		int n =Integer.parseInt(args[0]);
		int i,flag=0;
		 for (i = 2; i <= n/2; i++) { 
	         if (i == 1 || i == 0) 
	             continue; 
	         flag = 1; 
	             if (n % i == 0) { 
	                 flag = 0; 
	                 break; 
	             } 
	         } 
	         if ((n!=1&&n!=0)&&flag == 1) 
	             System.out.println(n+" is a prime number");
	         if((n!=1&&n!=0)&&flag==0)
	        	 System.out.println(n+" is a composite number");
	         if(n==1||n==0)
	        	 System.out.println(n+" is neither prime nor composite number");
	}
	}

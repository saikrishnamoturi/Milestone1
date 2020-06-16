package Loops;

public class Program13 {
	public static void main(String args[]) {
	int a =Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int i,j,flag;
	 for (i = a; i <= b; i++) { 
         if (i == 1 || i == 0) 
             continue; 
         flag = 1; 

         for (j = 2; j <= i / 2; ++j) { 
             if (i % j == 0) { 
                 flag = 0; 
                 break; 
             } 
         } 
         if (flag == 1) 
             System.out.println(i); 
}
	}
}

/*
  Name: Alina Rozenbaum
  Lab Instructor: Rupa Chatterjee
  Lab time: Tues. 2 pm
  Class: CS 1043
*/



import java.util.Scanner;

public class Stars 

{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.printf("Please enter an odd-number of output-lines (enter zero to exit the program): ");
		int n = console.nextInt();
	
		if (n%2 == 1)	
		{
			for (int jdx = 1; jdx <= n; jdx++)
			{
				if (jdx <= n*.5)
				{
					for(int kdx = 1; kdx < jdx; kdx++)
					{
						System.out.print(' ');
					}
			
					for (int idx = n; idx >=2*jdx-1; idx--)
					{
						System.out.print('*');
					}
			
					System.out.println();
				}	
    	   
			    else
			    {
			       	for(int kdx = n-1; kdx >= jdx; kdx--)
			    	{
			    		System.out.print(' ');
			    	}
   			
			    	for (int idx = n; idx <= 2*jdx-1; idx++)
			    	{
			    		System.out.print('*');
			    	}
   			
			    	System.out.println();
			    }
			}
		}
     	else
     		{
     			System.out.print("Program exited");
     		}
	}
				
}



import java.util.Scanner;

class Task_9
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks out of 1000: ");
		float marks=sc.nextFloat();
		double per=marks/10.0;

		if(per>=90)
		{
			System.out.println("Your Grade is: A");
		}
		else
		{
			if(per>=80)
		    {
			  System.out.println("Your Grade is: B");
		    }
		    else
		    {
		    	if(per>=70)
		        {
			      System.out.println("Your Grade is: C");
		        }
		        else
		        {
		        	if(per>=60)
		            {
			          System.out.println("Your Grade is: D");
		            }
		            else
		            {
		            	if(per>=40)
		                { 
			              System.out.println("Your Grade is: E");
		                }
		                else
		                {
		                	System.out.println("Your Grade is: F");
		                }
		            }
		        }
		    }
		}
	}
}
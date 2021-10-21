import java.util.Scanner;
import java.lang.Exception;

class Task_3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();

		if(n1==n2 || n1==n3 || n3==n2)
		{
			System.out.println("Invalid Input!!!!!!!!!!!");
		}
		else
		{
		  if(n1>n2)
		  {
		    if(n1>n3)
			{
				System.out.println("Number One Is Greter");
			}
			else
			{
				System.out.println("Number Three is Greater");
			}
		  }
		  else
		  {
	        if(n2>n3)
			{
				System.out.println("Number Two Is Greater");
			}
			else
			{
			System.out.println("Number Three Is Greater");
			}
		  }
	    }
	
    }
}
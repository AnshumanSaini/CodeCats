import java.util.Scanner;
import java.lang.Exception;

class Task_2
{
	public static void main(String args[]) throws java.lang.Exception
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			if(sc.nextInt()>=sc.nextInt())
			{
				System.out.println("Number One Is Greater!!!!!");
				
			}
			else
			{
				System.out.println("Number Two Is Greater!!!!!!!!!");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
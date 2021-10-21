import java.util.Scanner;
import java.lang.Exception;

class Task_1
{
	public static void main(String args[]) throws java.lang.Exception
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int k=n&1;
			if(k==1)
			{
				System.out.println("ODD!!!!!");
			}
			else
			{
				System.out.println("EVEN!!!!!!!!!!!");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
import java.util.Scanner;

class Task4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=2;
		int flag=0;
		while(i<n)
		{
			if(n%i==0)
			{
				flag=1;
			}
			++i;
		}
		if(flag==1)
		{
			System.out.println(n+" is not a prime number.");
		}
		else
		{
			System.out.println(n+" is a prime number.");
		}
	}
}
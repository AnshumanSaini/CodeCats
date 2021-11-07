import java.util.Scanner;

class Task_2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=n-1;
		while(i>=0)
		{
			int j=0;
			while(j<=i)
			{
				System.out.print("*");
				++j;
			}
			System.out.println("");
			--i;
		}
	}
}
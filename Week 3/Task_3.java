import java.util.Scanner;

class Task_3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		while(i<n)
		{
			int j=4;
			while(j>i)
			{
				System.out.print(" ");
				--j;
			}
			++j;
			while(j>(-i))
			{
				System.out.print("*");
				--j;
			}
			System.out.println("");
			++i;
		}
	}
}
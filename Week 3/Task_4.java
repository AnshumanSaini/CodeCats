import java.util.Scanner;

class Task_4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int k=((n-1)*2)-1;
		while(i<n-1)
		{
			int m=k;
			int j=0;
			while(j<i)
			{
				System.out.print(" ");
				++j;
			}
			System.out.print("*");
			
			while(m>0)
			{
				System.out.print(" ");
				--m;
			}
			System.out.print("*"+"\n");
			k-=2;
			++i;
		}
		i=1;
		while(i<n)
		{
			System.out.print(" ");
			++i;
		}
		System.out.print("*"+"\n");

		i=0;
	    k=((n-1)*2)-1;
		while(i<n-1)
		{
			int m=k;
			int j=i;
			while(j<n-2)
			{
				System.out.print(" ");
				++j;
			}
			System.out.print("*");
			while(m<=((n-1)*2)-1)
			{
				System.out.print(" ");
				++m;
			}
			System.out.print("*"+"\n");
			++i;
			k-=2;
		}
	}
}
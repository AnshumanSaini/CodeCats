import java.util.Scanner;

class Task7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			int n=sc.nextInt();
			int count=0;
			while(n!=0)
			{
				count=count+(n/5);
				n=n/5;
			}
			System.out.println(count);
		}
	}
}
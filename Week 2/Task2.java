import java.util.Scanner;

class Task2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int fact=1;
		while(i<=n)
		{
			fact*=i;
			++i;
		}
		System.out.println(fact);
	}
}
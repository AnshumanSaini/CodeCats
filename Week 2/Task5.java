import java.util.Scanner;

class Task5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=0;
		while(n!=0)
		{
			System.out.print(n%10);
			n=n/10;
		}
	}
}
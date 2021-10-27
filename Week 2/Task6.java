import java.util.Scanner;

class Task6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int base=n;
		int pow=sc.nextInt();
		while(--pow>0)
		{
			n=n*base;
		}
		System.out.println(n);
	}
}
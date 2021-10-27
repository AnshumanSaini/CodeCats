import java.util.Scanner;

class Task1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int sum=0;
		System.out.println("");
		while(i<=n)
		{
			System.out.print(" "+i);
			sum=sum+i;
			++i;
		}
		System.out.println("\n"+sum);
	}
}
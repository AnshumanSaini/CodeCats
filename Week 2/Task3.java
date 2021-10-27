import java.util.Scanner;

class Task3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int target=0;
		while(temp!=0)
		{
			target=target+((temp%10)*(temp%10)*(temp%10));
			temp=temp/10;
		}
		if(target==n)
		{
			System.out.println(n+" is an Armstrong number.");
		}
		else
		{
			System.out.println(n+" is not an Armstrong number.");
		}
	}
}

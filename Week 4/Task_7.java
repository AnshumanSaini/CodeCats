import java.util.Scanner;

public class Task_7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			long start=sc.nextLong();
			long jumps=sc.nextLong();
			long n=(jumps%4);
			n=jumps-n+1;
			while(n<=jumps)
			{
				if(start%2==0) start=start-n;
				else start=start+n;
				++n;
			}
			System.out.println(start);
		}
	}
}
import java.util.Scanner;

class Task_8
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			int G=sc.nextInt();
			while(G-->0)
			{
				int I=sc.nextInt();
			    int N=sc.nextInt();
			    int Q=sc.nextInt();

			    if(I==Q)
			    {
			    	System.out.println(N/2);
			    }
			    else
			    {
			    	System.out.println(N-(N/2));
			    }
			}
		}
	}
}
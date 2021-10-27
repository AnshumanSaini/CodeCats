import java.util.Scanner;

class Task4a
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int R1=sc.nextInt();
		if(R1<2)
		{
			R1=2;
		}
		int R2=sc.nextInt();
		while(R1<=R2)
		{
			int i=2;
			int flag=0;
			while(i<R1)
			{
				if(R1%i==0)
				{
					flag=1;
				}
				++i;
			}
			if(flag==0)
			{
				System.out.print(R1+" ");
			}
			++R1;
		}
	}
}
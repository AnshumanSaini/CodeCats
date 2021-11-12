import java.util.Scanner;

class Task_3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int i=0;
		while(i<n)
		{
			arr[i]=sc.nextInt();
			++i;
		}
		int key=sc.nextInt();
		key%=n;
		int[] result=new int[n];
		i=0;
		while(i<n)
		{
			if((i+key)<n)
			{
				result[i+key]=arr[i];
			}
			else
			{
				int temp=(i+key)-n;
				result[temp]=arr[i];
			}
			++i;
		}
		i=0;
		while(i<n)
		{
			System.out.print(result[i]+" ");
			++i;
		}
	}
}
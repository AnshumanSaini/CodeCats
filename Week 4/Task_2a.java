import java.util.Scanner;

class Task_2a
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];
		int i=0;
		int key=sc.nextInt();
		while(i<N)
		{
			arr[i]=sc.nextInt();
			++i;
		}
		i=0;
		while(i<N)
		{
			if(key==arr[i]) 
			{
				System.out.println("YES");
				return;
			}
			++i;
		}
		System.out.println("NO");
	}
}
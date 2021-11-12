import java.util.Scanner;

class Task_2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];
		int[] hash=new int[(int)(1e7+10)];
		int i=0;
		while(i<N)
		{
			arr[i]=sc.nextInt();
			++hash[arr[i]];
			++i;
		}
		int key=sc.nextInt();
		System.out.print(hash[key]);
	}
}
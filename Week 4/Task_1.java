import java.util.Scanner;

class Task_1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		--n;
		while(n>=0)
		{
			arr[n]=sc.nextInt();
			--n;
		}
		n=0;
		while(n<arr.length)
		{
			System.out.print(arr[n]+" ");
			++n;
		}
	}
}
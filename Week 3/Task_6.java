import java.util.Scanner;

class Task_6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int[] arr=new int[n];
		while(i<n)
		{
			arr[i]=sc.nextInt();
			++i;
		}
		int count=0;
		int key=sc.nextInt();
		for(int val : arr)
		{
			if(val==key) ++count;
		}
		System.out.println(count);
	}
}
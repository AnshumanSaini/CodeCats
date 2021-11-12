import java.util.Scanner;

class Task_2b
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];
		boolean[] hash=new boolean[(int)(1e7+10)];
		int i=0;
		int key=sc.nextInt();
		while(i<N)
		{
			arr[i]=sc.nextInt();
			hash[arr[i]]=true;
			++i;
		}
		if(hash[key]==true)
		{
			System.out.println("YES");
			return;
		}
		System.out.println("NO");
	}
}
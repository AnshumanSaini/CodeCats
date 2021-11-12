import java.util.Scanner;

class Task_6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];
		int i=0;
		while(i<N)
		{
			arr[i]=sc.nextInt();
			++i;
		}
		int key=sc.nextInt();
		int low=0;
		int high=N-1;
		int mid=0;
		while(low<high)
		{
			mid=(low+high)/2;
			if(arr[mid]==key)
			{
				System.out.println(mid);
				return;
			}
			if(arr[mid]>key)
			{
				high=mid-1;
			}
			if(arr[mid]<key)
			{
				low=mid+1;
			}
		}
		mid=(low+high)/2;
		if(arr[mid]<key) System.out.println(mid+1);
		else System.out.println(mid);
		
	}
}
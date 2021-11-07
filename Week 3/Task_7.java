import java.util.Scanner;

class Task_7
{
	public static void swap(int[] arr,int i, int j)
	{
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
	}
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
		i=n-1;
		while(i>0)
		{
			int j=0;
			while(j<i)
			{
				if(arr[j]>arr[j+1]) swap(arr,i,j);
				++j;
			}
			--i;
		}
		System.out.println("The largest element is: "+arr[n-1]);
		System.out.println("The smallest element is: "+arr[0]);
		System.out.println("The second largest element is: "+arr[n-2]);
		System.out.println("The second smallest element is: "+arr[1]);
	}
}
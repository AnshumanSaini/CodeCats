import java.util.Scanner;

class Task_5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int sum=0;
		int sum_E=0;
		int sum_O=0;
		int sum_IE=0;
		int sum_IO=0;
		int[] arr=new int[n];
		while(i<n)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
			if(i%2==0)
			{
				sum_IE+=arr[i];
			}
			else
			{
				sum_IO+=arr[i];
			}
			if(arr[i]%2==0)
			{
				sum_E+=arr[i];
			}
			else
			{
				sum_O+=arr[i];
			}
			++i;
		}
		System.out.println(sum+" is the sum of all elements.");
		System.out.println(sum_E+" is the sum of even elements.");
		System.out.println(sum_O+" is the sum of odd elements.");
		System.out.println(sum_IE+" is the sum of evem position elements.");
		System.out.println(sum_IO+" is the sum of odd postion elements.");
	}
}
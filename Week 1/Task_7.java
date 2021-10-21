import java.util.Scanner;

class Task_7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		int[] arr={2000,500,200,100,50,20,10,5,2,1};
		int i=0;
		while(i<arr.length)
		{
			int temp=amount/arr[i];
			System.out.println("Number of "+arr[i]+" Notes is: "+temp);
			amount=amount-temp*arr[i];
			++i;
		}
	}
}
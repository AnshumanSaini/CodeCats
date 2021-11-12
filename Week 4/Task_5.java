import java.util.Scanner;

class Task_5
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

		int[] result=new int[N];
		i=0;
		int j=N-1;
		int k=0;
		while(k<N)
		{
			if(i<j)
			{
			    if(arr[k]==0)
			    { 
			    	++i;
			    }

			    if(arr[k]==2)
			    {
				    result[j]=2;
				    --j;
			    }
		    }
		    ++k;
		}
		while(i<=j)
		{
			result[i]=1;
			++i;
		}
		i=0;
		while(i<N)
		{
			System.out.print(result[i]+" ");
			++i;
		}

	}
}
import java.util.Scanner;

class Task_4
{
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
	    i=0;
	    int key=sc.nextInt();
	    while(i<n-1)
	    {
		    if(arr[i]>key) return;
		    int j=i+1;
		    while(j<n)
		    {
			    if((arr[i]+arr[j])==key) System.out.print("["+i+","+j+"] ");
			    ++j;
		    }
		    ++i;
	    }
	}
}
import java.util.*;

class Task_6a
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		    TreeMap< Integer,Integer> tm=new TreeMap<>();
		    int n=sc.nextInt();
		    int i=0;
		    while(i<n)
		    {
			    int temp=sc.nextInt();
			    int freq=tm.getOrDefault(temp,0);
			    ++freq;
			    tm.put(temp,freq);
			    ++i;
		    }
		    System.out.println("The Number Is Present "+tm.getOrDefault(sc.nextInt(),0)+" Number Of Times.");
		}
	}
}
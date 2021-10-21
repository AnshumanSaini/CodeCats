import java.util.Scanner;

class Task_10
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double BS=sc.nextDouble();

		if(BS>20000)
		{
			System.out.println("one");
			double temp=BS+BS*0.3;
			temp=temp+BS*0.95;
			BS=temp;
		}
		else
		{
			if(BS>10000 || BS==20000)
		    {
		    	System.out.println("two");
			  double temp=BS+BS*0.25;
			  temp=temp+BS*0.9;
			  BS=temp;
		    }
		    else
		    {
		    	System.out.println("three");
			      double temp=BS+BS*0.2;
			      temp=temp+BS*0.8;
			      BS=temp;
		    }
		}
		System.out.println("Gross Salary is: "+BS);
	}
}
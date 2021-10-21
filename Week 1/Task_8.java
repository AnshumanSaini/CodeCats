import java.util.Scanner;
import java.lang.Math;

class Task_8
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A: ");
		double a=sc.nextDouble();

		System.out.println("\nEnter B: ");
		double b=sc.nextDouble();

		System.out.println("\nEnter C: ");
		double c=sc.nextDouble();

		double D=b*b-4.0*a*c;

		double root1=(-b+Math.sqrt(D))/2.0*a;
		double root2=(-b-Math.sqrt(D))/2.0*a;
		
		if(D<0)
		{
			System.out.println("Roots are Imaginary");
		}
		if(D>=0)
		{
			System.out.println("First Root is: "+root1+"\n"+"Second Root is: "+root2);
		}
	}
}
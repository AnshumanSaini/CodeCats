import java.util.Scanner;

class Q2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int i=0;
		while(i<str.length() && str.charAt(i)=='0')
		{
			++i;
		}
			while(i<str.length())
			{
				if(str.charAt(i)=='0')
				{
					System.out.println("It is a duck number.");
					return;
				}
				++i;
			}
			System.out.println("It is not a duck number.");

	}
}
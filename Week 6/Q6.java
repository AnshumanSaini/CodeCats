import java.util.Scanner;

class Q6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int i=0;
		while(i<str.length())
		{
			if(str.charAt(i)=='G')
			{
				System.out.print(str.charAt(i));
				++i;
			}
			else if(str.charAt(i)=='(' && str.charAt(i+1)==')')
			{
				System.out.print('o');
				i+=2;
			}
			else if(str.charAt(i)=='(' && str.charAt(i+1)=='a')
			{
				System.out.print("al");
				i+=4;
			}
			else ++i;
		}
	}
}
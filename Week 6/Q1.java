import java.util.Scanner;

class Q1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str2=sc.next();
		int i=0;
		int[] arr=new int[26];
		int[] check=new int[26];
		while(i<str.length())
		{
			++arr[str.charAt(i)-'a'];
			++i;
		}
		i=0;
		while(i<str2.length())
		{
			++check[str2.charAt(i)-'a'];
			++i;
		}

		i=0;
		while(i<26)
		{
			if(arr[i]!=check[i]) System.out.print((char)(i+97));
			++i;
		}
	}
}
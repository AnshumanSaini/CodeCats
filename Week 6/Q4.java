import java.util.Scanner;

class Q4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int i=0;
		int result=0;
		while(i<str.length())
		{
			if(i<(str.length()-1))
			{
				if(str.charAt(i)=='I' && str.charAt(i+1)=='V') {result+=4;i+=2;continue;}
				if(str.charAt(i)=='I' && str.charAt(i+1)=='X') {result+=9;i+=2;continue;}
				if(str.charAt(i)=='X' && str.charAt(i+1)=='L') {result+=40;i+=2;continue;}
				if(str.charAt(i)=='X' && str.charAt(i+1)=='C') {result+=90;i+=2;continue;}
				if(str.charAt(i)=='C' && str.charAt(i+1)=='D') {result+=400;i+=2;continue;}
				if(str.charAt(i)=='C' && str.charAt(i+1)=='M') {result+=900;i+=2;continue;}
			}
			if(str.charAt(i)=='I'){result+=1;++i;continue;}
			if(str.charAt(i)=='V'){result+=5;++i;continue;}
			if(str.charAt(i)=='X'){result+=10;++i;continue;}
			if(str.charAt(i)=='L'){result+=50;++i;continue;}
			if(str.charAt(i)=='C'){result+=100;++i;continue;}
			if(str.charAt(i)=='D'){result+=500;++i;continue;}
			if(str.charAt(i)=='M'){result+=1000;++i;continue;}
		}
		System.out.println(result);
	}
}
//calculate factorial of function

import java.util.*;
import java.io.*;

class Q4
{
	static int fun(int N)
	{
		if(N==0) return 1;
		return N*fun(N-1);
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(fun(5));
	}
}

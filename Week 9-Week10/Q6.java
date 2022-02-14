//O(log N) power of X wrt N recursion  ...

import java.util.*;
import java.io.*;

class Q6
{
	static int fun(int X,int N)
	{
		if(N==0) return 1;
		int res=fun(X,N/2);
		int result=res*res;
		if(N%2!=0) result=result*X;
		return result;
	}

	public static void main(String args[])
	{
		System.out.println(fun(2,10));
	}
}
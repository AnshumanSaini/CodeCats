//print the power of X with respect to N
 
import java.util.*;
import java.io.*;

class Q5
{
	static int fun(int X,int N)
	{
		if(N==0) return 1;
		return X*fun(X,N-1);
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(fun(2,10));
	}
}

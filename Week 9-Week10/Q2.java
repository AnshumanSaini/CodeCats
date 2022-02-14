//Print Increasing sequence

import java.io.*;
import java.util.*;

class Q2
{
	static void fun(int N)
	{
		if(N==0) return;
		fun(N-1);
		System.out.println(N);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		fun(5);
	}

}
// Tower Of Hanoi
import java.io.*;
import java.util.*;

class Q7
{
	static void TOI(int n,char x,char y,char z)
	{
		if(n==0) return;
		TOI(n-1,x,z,y);
		System.out.println("Move "+n+" from "+x+" to "+y);
		TOI(n-1,z,y,x);
	}

	public static void main(String args[])
	{
		TOI(3,'A','B','C');
	}
}
// Find Maximum in an array
import java.io.*;
import java.util.*;

class Q9
{
	static int findMax(int[] arr,int ind)
	{
		if(ind==arr.length-1) return arr[ind];
		int max=findMax(arr,ind+1);
		if(max>arr[ind]) return max;
		else return arr[ind];
	}

	public static void main(String args[])
	{
		int[] arr={2,5,3,10,8,1,56,2,8};
		System.out.println(findMax(arr,0));
	}
}
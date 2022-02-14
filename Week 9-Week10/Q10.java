// print first Index of Occurence
import java.io.*;
import java.util.*;

class Q10
{
	static int firstInd(int[] arr,int key,int ind)
	{
		if(ind==arr.length) return -1; 
		if(arr[ind]==key) return ind;
		else return(firstInd(arr,key,ind+1));
	}
	public static void main(String args[])
	{
		int[] arr={2,5,46,2,4,2,5,8,2,5,1,5,8,5};
		System.out.println(firstInd(arr,100,0));
	}
}
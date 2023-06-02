package practice_Arrays;

import java.util.Scanner;

public class AddArraysOfEqualLength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//INPUT STARTS
		System.out.println("ENTER THE SIZE OF FIRST ARRAY");
		int size1 = sc.nextInt();
		if(size1<=0)
		{
			System.out.println("INVALID ARRAY SIZE");
			System.exit(0);
		}
		int[]a=new int[size1];
		System.out.println("ENTER THE ELEMRNTS OF FIRST ARAY");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int size2 = size1;
		int[] b=new int[size2];
		System.out.println("ENTER THE ELEMENTS OF SECOND ARRAY");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		//INPUT ENDS
		int[] c=new int[size2];
		for(int i=0;i<size2;i++)
		{
			c[i]=a[i]+b[i];
			System.out.println(c[i]);	   
		}
	}
}


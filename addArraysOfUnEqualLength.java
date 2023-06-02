package practice_Arrays;

import java.util.Scanner;

public class addArraysOfUnEqualLength {
	public static  void main(String[] args) {
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
		System.out.println("ENTER THE SIZE OF SECOND ARRAY");
		int size2 = sc.nextInt();
		if(size2<=0)
		{
			System.out.println("INVALID ARRAY SIZE");
			System.exit(0);
		}
		int[] b=new int[size2];
		System.out.println("ENTER THE ELEMENTS OF SECOND ARRAY");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		//INPUT ENDS
		int size3=size1>size2?size1:size2;
		int[] c=new int[size3];
		for(int i=0;i<c.length;i++) {

			if(i<size1 && i<size2) 
			{
				c[i]=a[i]+b[i];
			}else
				if(i>=size1)
				{
					c[i]=b[i];
				}
				else
					if(i>=size2) 
					{
						c[i]=a[i];
					}
		}
		System.out.println("Sum of two Arrays are :");
		for(int i=0;i<size3;i++)
		{
			System.out.println(c[i]);	   
		}
	}
}

package Array;

import java.util.Scanner;

public class ElementsInDescendingOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF THE ARRAY");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("ENTER THE ARRAY ELEMENTS");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		//SORT ARRAY IN DESCENDING ORDER
		for(int i=0;i<a.length;i++)
		{                                     
			for(int j=i+1;j<a.length;j++)        //1,2,3,4   i[0]=1,  j=i+1=2
			{
				if (a[i]< a[j])
				{
					int temp=a[i];     // a[0]=1 temp=1  a[0]=2, a[j]=1
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Elements in Descending Order Are");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}


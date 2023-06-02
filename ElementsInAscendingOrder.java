package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ElementsInAscendingOrder {    //0,1,2,3,4,5
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF THE ARRAY");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("ENTER THE ARRAY NUMBERS");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Elements in Ascending Order Are");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}
}

package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMinimumNumberInArray {
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
		Arrays.sort(a);
		System.out.println("The Second Maximum Number in a Given Array is "+a[1]);
	}
}

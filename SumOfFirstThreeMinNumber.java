package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfFirstThreeMinNumber {
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
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("The Sum of First 3  Minimum Number in a Given Array is "+sum);

	}
}

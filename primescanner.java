package basicPrograms;

import java.util.Scanner;

public class primescanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int num = sc.nextInt();
		int i=2; int count=0;
		while(i<=num/2) {
			if (num%i==0) {
				count=1;
				break;
			}
			i++;
		}
		if(count==0) {
			System.out.println(num+" is a PrimeNumber");
		}else {
			System.out.println(num+" is Not a PrimeNumber");
		}
	}
}

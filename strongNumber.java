package basicPrograms;

import java.util.Scanner;

public class strongNumber {
	public static void main(String[] args) {
		// A NUMBER WHOSE SUM OF ALL DIGITS FACTORIAL IS EQUAL TO THE ORIGINAL NUMBER
		//145= 1!+4!+5!=1+24+120=145  (also 1,2,40585)
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int sum=0; int temp=num;
		while(num>0)
		{
			int rem=num%10;
			int fact=1;
			while(rem>0)
			{
				fact=fact*rem;
				rem--;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+ " is a strong number");
		}else
		{
			System.out.println(temp+ " is not a strong number");
		}
	}
}

package basicPrograms;

public class NeonNumber {
	public static void main(String[] args) {
		//A NUMBER WHOSE SUM OF DIGITS OF  ITS SQUARE,IS EQUAL TO THE NUMBER ITSELF
		int num=9;
		int sum=0;
		int sq=num*num;
		while(sq>0)
		{
			int rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
		}
		if (sum==num) {
			System.out.println(num+" is a Neon Number");
		}else
		{
			System.out.println(num+"is Not a Neon Number");	
		}
	}
}

package basicPrograms;

public class SpyNumber {
	//IF THE SUM OF ALL THE DIGITS IS EQUAL TO PRODUCT OF ALL THE DIGITS THEN IT IS A SPY NUMBER(SUM==PROD)
	public static void main(String[] args) {
		int num=123;
		int temp=num;
		int sum=0; int prod=1;
		while (num>0) {
			int rem=num%10;
			sum=sum+rem;
			prod=prod*rem;
			num=num/10;
		}
		if (sum==prod) {
			System.out.println(temp+" is A SpyNumber");
		}else 
		{
			System.out.println(temp+" is Not A SpyNumber");
		}
	}

}

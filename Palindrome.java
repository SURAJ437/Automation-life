package basicPrograms;

public class Palindrome {
	public static void main(String[] args) {
		int num=121;//454,11,151,1234321
		int temp=num;
		int rev=0;

		while(num>0) {

		int	rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
			if (temp==rev) 
			{
				System.out.println(temp+" is a Palindrome");
			}
			else 
				System.out.println(temp+" is Not a palindrome");
		}
	}




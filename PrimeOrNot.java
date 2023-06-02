package basicPrograms;

public class PrimeOrNot {
	public static void main(String[] args) {
		int i=2; int count=0;
		int num=7;
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
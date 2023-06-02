package basicPrograms;

public class FactorialOfNumber {
	public static void main(String[] args) {
		int num=4;
		long fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
}

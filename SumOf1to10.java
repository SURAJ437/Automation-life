package basicPrograms;

public class SumOf1to10 {
	public static void main(String[] args) {
		int a=1;
		int sum=0;
		while(a<=10) {
			sum=sum+a;
			a++;
		}
		System.out.println(sum);
	}
}
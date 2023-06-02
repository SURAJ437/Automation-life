package basicPrograms;

public class SquareRoot {
	public static void main(String[] args) {
		int num=9;
		double temp;
		double sqrt=num/2;
		do {
			temp=sqrt;
			sqrt=(temp+(num/temp))/2;
		} while ((temp-sqrt)!=0);
		System.out.println(sqrt);
	}
}

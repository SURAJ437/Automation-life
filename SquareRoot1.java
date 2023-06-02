package basicPrograms;

public class SquareRoot1 {
	public static void main(String[] args) {
		int n=9;
		int i=1; int count=0;
		while (i<=n/2) {
			int sq=i*i;
			if (sq==n) {
				count=1;
				break;
			}
			i++;
		}
		if (count==1) {
			System.out.println("Square Root of "+n+" is "+i);
		}else
		{
			System.out.println("ENTER A PERFECT SQUARE");
		}
	}

}

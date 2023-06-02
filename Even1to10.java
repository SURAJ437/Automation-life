package basicPrograms;

public class Even1to10 {
	public static void main(String[] args) {
		int num=1;
		while (num<=10) {
			if(num%2==0)
			{
				System.out.println(num);
			}
			num++;
		}
	}
}

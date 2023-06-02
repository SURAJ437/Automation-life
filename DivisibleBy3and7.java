package basicPrograms;

public class DivisibleBy3and7 {
	public static void main(String[] args) {
		int num=28;
		if (num%3==0&&num%7==0) {
			System.out.println(num+" is Divisible By 3 and 7");
		}else
		{
			System.out.println(num+" Not Divisible By 3 and 7");
		}
	}
}

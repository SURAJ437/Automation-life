package basicPrograms;

public class P1 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		if (a>b&&a++<b--) {
			System.out.println(a);
			System.out.println(b);
		}
		System.out.println(a);
		System.out.println(b);
	}

}

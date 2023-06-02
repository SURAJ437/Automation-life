package strings;

public class ChToString01 {
	public static void main(String[] args) {
		char[] ch= {'A','P','P','L','E'};
		System.out.println(ch);
		String s1 = new String(ch);//Using constructor
		System.out.println(s1);
	}
}

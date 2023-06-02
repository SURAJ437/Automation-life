package strings;

public class ChTOStringUsingValueOf {
	public static void main(String[] args) {
		char[] ch= {'A','P','P','L','E'};
		//	System.out.println(ch);
		String s1 = String.valueOf(ch);//char type to string
		System.out.println(ch);
		String s2 = String.valueOf(10);//int type to string
		System.out.println(s2);

	}
}

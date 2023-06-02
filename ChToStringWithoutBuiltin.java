package strings;

public class ChToStringWithoutBuiltin {
	public static void main(String[] args) {
		char[] ch= {'A','P','P','L','E'};
		String s1="";
		{
			for (int i=0;i<ch.length;i++) {
				s1=s1+ch[i];
			}
			System.out.println(s1);
		}
	}
}

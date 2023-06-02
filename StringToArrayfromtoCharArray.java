package strings;

public class StringToArrayfromtoCharArray {
	public static void main(String[] args) {
		// using toCharArray

		String name = "SURAJ";
		char[] ch=name.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	}
}

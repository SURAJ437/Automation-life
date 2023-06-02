package practice_Arrays;

public class StringWithNumSpCh {
	public static void main(String[] args) {
		// TO EXTRACT NUMBERS,SPECIAL CHARACTERS,ALPHABETS FROM A STRING
		String s = "@123ABC456$";
		String alpha = "";//ALPHABETS
		String num ="";  //NUMBER
		String sp = ""; //SPECIAL CHARACTER
		for (int i=0; i<s.length();i++)
		{
			if (s.charAt(i)>='A' && s.charAt(i)<='z')
			{
				alpha = alpha + s.charAt(i);
			}
			else if (s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num = num + s.charAt(i);
			}
			else
			{
				sp = sp + s.charAt(i);
			}		
		}	
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(sp);
		
	}
}

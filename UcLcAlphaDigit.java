package basicPrograms;

public class UcLcAlphaDigit {
	public static void main(String[] args) {
		char ch='@';
		if(ch>='A'&&ch<='Z') {
			System.out.println(ch+" is Uppercase Alphabet");
		}else
		if(ch>='a'&&ch<='z') {
			System.out.println(ch+" is Lowercase Alphabet");
		}else
		if(ch>='0'&&ch<='9') {
			System.out.println(ch+" is a Digit");
		}else {
			System.out.println(ch+" is a special character");
		}
	}
}

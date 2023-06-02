package basicPrograms;

public class AlphabetOrNot {
	public static void main(String[] args) {
		char ch='S';
		if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
		{
			System.out.println(ch+" is an Alphabet");
		}else
			System.out.println(ch+" is  Not an Alphabet");
	}
}

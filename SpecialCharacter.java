package basicPrograms;

public class SpecialCharacter {
	public static void main(String[] args) {
		char ch='@';
		if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'|| ch>='0'&&ch<='9') {
			System.out.println(ch+" is Not a special charcter");
		}else {
			System.out.println(ch+" is  a special charcter");
		}
	}
}

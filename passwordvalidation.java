package basicPrograms;

public class passwordvalidation {

	public void validate(String password) {
		if((password.length())>=8 && Character.isUpperCase(password.charAt(0)))
		{
			System.out.println("I'am entering space validation");
			if(!(password.contains(" "))){
				System.out.println("I'm entering special Character validation");
				if((password.contains("@") || password.contains("#")
						|| password.contains("!") || password.contains("~")
						|| password.contains("$") || password.contains("%")
						|| password.contains("^") || password.contains("&")
						|| password.contains("*") || password.contains("(")
						|| password.contains(")") || password.contains("-")
						|| password.contains("+") || password.contains("/")
						|| password.contains(":") || password.contains(".")
						|| password.contains(", ") || password.contains("<") || password.contains("{") || password.contains("}")
						|| password.contains(">") || password.contains("?") || password.contains("_")
						|| password.contains("|"))){
					System.out.println("I'm entering Number validation");
					int numberCount = 0;
					for(int i = 0; i<=9; i++){
						// to convert int to string
						String str1 = Integer.toString(i);
						if(password.contains(str1)){
							numberCount = 1;
						}


					}

					if(numberCount == 1){
						System.out.println("I'm entering Uppercase validation");
						int uppercaseCount = 0;
						for(int i = 65; i <= 90; i++){
							char ucc = (char)i;
							String s=Character.toString(ucc);
							if(password.contains(s)) {
								uppercaseCount = 1;
							}

					}
						if(uppercaseCount == 1){
							System.out.println("I'm entering the lowercase validation");
							int lowercaseCount = 0;
							for(int i = 97; i <= 122; i++) {
								char lcc = (char)i;
								String s=Character.toString(lcc);
								if(password.contains(s)) {
									lowercaseCount = 1;
								}
							}
							if(lowercaseCount==1) {
								System.out.println("YES I'm a VALID PASSWORD");
							}else {
								System.out.println("NO I'm not a VALID PASSWORD");
							}
							
						}else {
							System.out.println("NO I'm not a VALID PASSWORD");
						}

					}else {
						System.out.println("NO I'm not a VALID PASSWORD");
					}

				}else {
					System.out.println("NO I'm not a VALID PASSWORD");
				}
			}
			else {
				System.out.println("NO I'm not a VALID PASSWORD");
			}
		}
		else {
			System.out.println("NO I'm not a VALID PASSWORD");
		}
	}
	public static void main(String args []) {
		
		passwordvalidation pass = new passwordvalidation();
		pass.validate("Suraj55555");
	}
}

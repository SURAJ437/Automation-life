package basicPrograms;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		int count=0;
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=3;
		int n=8;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE PASSWORD");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch.length>=n)
			{
				count=1;
			}
			if(ch[i]>='0'&&ch[i]<='9') {
				count1=1;
			}
			if(!(ch[i]>='A'&&ch[i]<='Z'||ch[i]>='a'&&ch[i]<='z'||ch[i]>='0'&&ch[i]<='9')&&ch[i]!=' ')
			{
				count2=1;
			}
			if(ch[0]>'A'&&ch[0]<='Z')
			{
				count3=1;
			}
		}	
		if(count4 == count1+count2+count3) {
			System.out.println("Click On Login");
		}
		if(count==0)
		{
			System.out.println("PASSWORD SHOULD BE OF MINIMUM 8 CHARACTERS");	
		}
		if(count1==0)
		{
			System.out.println("PASSWORD SHOULD CONTAIN  ATLEAST 1 DIGIT");
		}
		if(count2==0)
		{
			System.out.println("PASSWORD SHOULD CONTAIN ATLEAT 1 SPECIAL CHARACTER");
		}
		if(count3==0)
		{
			System.out.println("PASSWORD SHOULD START WITH UPPERCASE LETTER");
		}else
			if(count==4)
			{
				System.out.println("PASSWORD SHOULD NOT CONTAIN SPACE AS A CHRACTER");
			}	
	}	
}
package basicPrograms;

import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING");
		String str1 = sc.nextLine();
		
		String str2 = "";
		for(int i=str1.length()-1;i>=0;i--)
		{
			str2+=str1.charAt(i);
		}
		System.out.println(str2);
	}
}

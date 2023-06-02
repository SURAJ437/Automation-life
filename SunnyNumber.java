package basicPrograms;

public class SunnyNumber {
	//IF THE NUBER NEXT TO THE GIVEN NUMBER IS PERFECT SQUARE THEN IT IS A SUNNYNUMBER
	public static void main(String[] args) {
		int num=8;
		int n=num+1; int i=1;int count=0;
		while (i<=n/2) {
			int sq=i*i;
			if(sq==n) {
				count=1;
				break;
			}
			i++;	
		}
		if(count==1) {
			System.out.println(i+"is a perfect square of "+n);
			System.out.println(num+" is a SunnyNumber");
		}else
		{
			System.out.println(num+" is Not a SunnyNumber");
		}
	}
}


package basicPrograms;

public class ArmstrongNumber {
	public static void main(String[] args) {
	int num=153;
	int temp=num;
	int temp1=num;
	int sum=0; 
	int count=0;

		while(num>0)
		{
			num=num/10;
			count++;
		}
		while(temp>0)
		{
			int rem=temp%10;
			int prod=1;
			int i=count;
			while(i>0)
			{
				prod=prod*rem;
				i--;
			}
			sum=sum+prod;
			temp=temp/10;
		}
		if(temp1==sum)
		{
			System.out.println(temp1+" is a armstrong number");
		}else
		{
			System.out.println(temp1+" is not a armstrong Number");
		}
	}
}


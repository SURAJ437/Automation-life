package practice_Arrays;

public class SumofFirstTwoLargestValue {
	public static void main(String[] args) {
		int sum = 0;
		int a[]= {20,10,30,50,40};
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1; j<a.length;j++)
			{
				if (a[i]<a[j]) //DESCENDING ORDER
				{
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		System.out.println("FIRST LARGEST VALUE  : "+a[0]);
		System.out.println("SECOND LARGEST VALUE : "+a[1]);
		for(int i=0; i<2; i++)
		{
			sum = sum+a[i];
		}
		System.out.println("The Sum of the First Two Largest value: " + sum);
	}
}


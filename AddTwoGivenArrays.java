package Array;

public class AddTwoGivenArrays {
	public static void main(String[] args) {
		int[]a={1,2,4,3};//j=0,1,2,3=Index number
		int[]b={6,5,8,7};//k=0,1,2,3
		int size=a.length+b.length;
		int[]c=new int[size];//i=0,1,2,3,4,5,6,7=index number
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<a.length;j++,i++)
			{
				c[i]=a[j];     //  c[0]=a[0]=1
			}
			for(int k=0;k<b.length;k++,i++)
			{
				c[i]=b[k];
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}
}


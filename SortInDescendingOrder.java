package practice_Arrays;
//sort all the elements in descending order
public class SortInDescendingOrder {

	public static void main(String[] args) {
		int a[]= {10,30,20,40,50};
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1; j<a.length;j++)
			{
				if (a[i]<a[j])//condition for descending order 
				{
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");			
		}
	}
}

public class FindLargest {
public static void main(String[] args) {
	int a[]={23,6,96,89,74};
	int temp=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>temp)
		{
			temp=a[i];
		}
	}
	System.out.println(temp);
}
}

import java.util.*;
class LinearSearch
{
	int linearSearch(int arr[],int x,int n)
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i]==x)
			return i;
		}
		return -1;
	}
	public static void main(String args[])
	{
		LinearSearch ls=new LinearSearch();
		int a[]={1,2,3,4,9};
		int n=a.length;
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int result = ls.linearSearch(a,x,n);
		if(result==-1)
		System.out.println("not found");
		else
		System.out.println("found at index: "+result);
	}
}			

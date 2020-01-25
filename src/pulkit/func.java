package pulkit;
import java.util.Scanner;
public class func
{
	public static void main(String[] args) {
	//System.out.println("entetr telements :");
	
	greater();
	}
	public static void greater()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of element:");
		
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter  elements");
		for(int i=0;i<n;i++)
		{
			 a[i]=s.nextInt();
		}
		int max=a[0];
		for(int i=0;i<n;i++)
	{
		if(a[i]>max)
		{
		max=a[i];	
		}
	}
		System.out.println("greatest element is:");
		System.out.println(max);
}
}
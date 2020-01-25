package pulkit;
import java.util.Scanner;
public class binary {
	//binary search
	
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	
	int a[]=new int[n];
	for(int i=0;i<n;i++){
	a[i]=s.nextInt();
	}
	int m=s.nextInt();
	int b[]=new int[m];
	for(int i=0;i<m;i++) {
		b[i]=s.nextInt();
	}
	
	for(int i=0;i<m;i++) {
		System.out.println("Working"+(i+1));
	int lb=0,ub=n,mid,c=0;
	mid=(lb+ub)/2;
	while(lb<=ub){
	if(a[mid]>b[i])
	ub=mid-1;

	else if(a[mid]==b[i])
	{while(mid>=0) {
	 if(a[mid]==b[i] ){
		c++;
		mid--;}
	}break;
	}
	else
	lb=mid+1;
	mid=(lb+ub)/2;
	}if(c!=0) 
		System.out.println(c);
	else
		System.out.println("NOT PRESENT");
	
	}
	}
	
	

}

package pulkit;

import java.util.*;

public class tc {
	public static void main(String[] args) {
		int d,i=1;
		int  even=0,odd=0;
		Scanner s=new Scanner(System.in);	
		int n=s.nextInt();
		while(n>0) {
			d=n%10;
			if(i%2==0) 
				even+=d;
			else
				odd+=d;
				n/=10;
				i++;
			
		}
		System.out.println(Math.abs(even-odd));
	}
}


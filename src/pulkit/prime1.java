package pulkit;

import java.util.Scanner;

class prime1 {
	public void prime(int a,int b) {
		for(int i=a;i<=b;i++) {
			int c=0;
			for(int j=2;j<(int)Math.sqrt(a);j++) {
				if(i%j==0)
					c=1;
			}
			if(i!=1) {
			if(c==0)
				System.out.println(i);
		}
		}
		
		
	}
public static void main(String[] args) {
	prime1 p=new prime1();
	Scanner s=new Scanner(System.in);
	System.out.println("Enetr test cases:");
	int n=s.nextInt();
	for(int k=0;k<n;k++) {
		System.out.println("Enter range:");
	    int l=s.nextInt();
		int d=s.nextInt();
		p.prime(l,d);
	}
	
}
}

package pulkit;

import java.util.Scanner;

class prime2 {
	public static void prime(int b) {
		for(int i=3;i<=b;i++) {
			int c=0;
			for(int j=3;j<(int)Math.sqrt(b);j+=2) {
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
	Scanner s=new Scanner(System.in);
	System.out.println("Enter range:");
	int n=s.nextInt();
	prime(n);
	}
}

//prime numbers in given range
package pulkit;

import java.util.Scanner;

class euler8 {
	public static void prime(int b) {
		for(int i=3;i<=b;i+=2) {
			int c=0;
			for(int j=2;j<(int)Math.sqrt(i);j++) {
				if(i%j==0)
					c=1;
			}
			
			if(c==0)
				System.out.print(i+" ");
		
		}
		
		
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter range:");
	int n=s.nextInt();
	System.out.print("2"+" ");
	prime(n);
	}
}

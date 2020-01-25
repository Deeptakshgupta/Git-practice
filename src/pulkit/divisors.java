	// divisors in given range
	package pulkit;
	import java.util.*;
	public class divisors {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int lb=s.nextInt();
		int ub=s.nextInt();
		int d=s.nextInt();
		int a=Math.floorDiv(lb,d);
		int b=(ub/d);
		if(d<a){
		System.out.println( b-a+1);
		}
		else
			System.out.println(b-a);
				
	}
	}

package pulkit;

import java.util.Scanner;

public class spcandy{
	void split(int a,int b) {
		int candy=b/a;
		int teach=b%a;
		System.out.println("candies:"+candy);
		System.out.println("teacher:"+teach);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		spcandy sp=new spcandy();
		System.out.println("Enter test cases:");
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("enter children");
			int child=s.nextInt();
			System.out.println("Enetr toffies:");
			int tof=s.nextInt();
			sp.split(child,tof);
		}
	}
}
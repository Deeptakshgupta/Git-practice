package pulkit;
import java.util.Scanner;
public class quiz extends Thread{
	public void run(){
		Scanner s=new Scanner(System.in);
		String a[]=new String[2];
		a[0]="Q1. if a class has only private constructors,is it\n possible to create its object:\n\na.Ture\nb.False";
		a[1]="\nQ2.Array indices start with:\na.1\nb.0\nc.255\nd.127";
		String str[]=new String[2];
		for(int i=0;i<2;i++) {
			try{
				str[i]=s.nextLine();
		    	
			
				Thread.sleep(1000);
			
			System.out.println(a[i]);
		}catch(Exception e) {}
		}}
public static void main(String args[]) {
	
	quiz q=new quiz();
	q.start();	
	
}	
}


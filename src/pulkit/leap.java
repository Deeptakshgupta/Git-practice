package pulkit;
import java.util.Scanner;
public class leap {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any year ");
        int yr=s.nextInt();
        if(yr%4==0&&yr%100!=0||yr%400==0)
        	System.out.print(yr+" year entered is a leap year");
        else
        	System.out.print(yr+" is not a leap year");

	}
	
}

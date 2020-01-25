package pulkit;
import java.util.Scanner;
public class vol {
public static void main(String[] args) {
	volume();
}
public static void volume()
{
	System.out.println("Enter dimensions :");
	Scanner s=new Scanner(System.in);
	double wdth=s.nextDouble();
	double dpth=s.nextDouble();
	double ht=s.nextDouble();
	double v=wdth*dpth*ht;
	//System.out.println("Volume is:");
	System.out.println("Volume is:"+v);
	
}
}

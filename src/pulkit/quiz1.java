package pulkit;
import java.util.Scanner;
public class quiz1 {
public static void main(String[] args) {
    
	String q1="Q1. if a class has only private constructors,is it\n possible to create its object:\n\na.Ture\nb.False";
	String q2="\nQ2.Array indices start with:\na.1\nb.0\nc.255\nd.127";
	String q3="\nQ3.What is the output\nSystem.out.print((int)0.1)\nSystem.out.print((int)0.5\nSystem.out.print((int)0.9;)))";
	String q4="\nQ4.fill up to get 4 as Output:\nint[] arr= {1,2,3,4};\nint x=arr[arr[_]];\nSystem.out.print(x);";
    String q5="\nQ5.Output=?\nint a=9%5%5;\n System.oyt.println(a);";
	question Q[]= {
			new question(q1,"a"),
			new question(q2,"b"),
	        new question(q3,"000"),
	        new question(q4,"2"),
	        new question(q5,"4")
	};
	taketest(Q);
}
public static void taketest(question []Q) {
	int c=0;
	Scanner s=new Scanner(System.in);
	for(int i=0;i<5;i++) {
		System.out.println(Q[i].prompt);
       String ans=s.nextLine();	
       if(ans.equals(Q[i].answer))
	{
    	   c+=1;
	}}
System.out.println("Score"+c+"/"+Q.length);
}
}

package pulkit;
import java.util.*;
public class permutation2 {
static void  perm(String str,String ans ) {
	
	if(str.length()==0) {
		count++;
		System.out.println(ans+" ");
	//return;
	}
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);// add each character of string in permutations.
	
		String ros=str.substring(0,i)+str.substring(i+1);
		// this fixes each element turn by turn elements at first position
		//and rest of the elements are rotated accordng to length of the string
		
		perm(ros,ans+ch);
		
		//recursive call until string gets empty;
		//after this i will be incremented
	}
	System.out.println(count);
}
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	//int c;
	for(int i=0;i<n;i++) {
	String sc=s.next();
	perm(sc,"");
	
	}
	//perm(sc,"");
}
}

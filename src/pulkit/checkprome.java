//Check prime
package pulkit;
import java.math.BigInteger;
import java.util.*;
public class checkprome {

	    static boolean checkPrime(long n)

	    {  BigInteger b = new BigInteger(String.valueOf(n));
	        return b.isProbablePrime(1);

	    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n,c=0,count=0;
	n=s.nextInt();
	
	
	if(checkPrime(n))
		count++;
	System.out.println(count);
}
}

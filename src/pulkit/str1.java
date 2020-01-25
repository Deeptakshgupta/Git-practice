package pulkit;
//changing string to char and vice versa
public class str1 {
	public static void main(String args[])
	   {
	      // Method 1: Using toString() method
	      char ch = 'a';
	      String str = Character.toString(ch);  // Character to String
	      System.out.println("String is: "+str);
	 
	      // Method 2: Using valueOf() method
	      String str2 = String.valueOf(ch);//string.value of(character variable)
	      System.out.println("String is: "+str2);
	   }
}



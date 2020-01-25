package pulkit;
//string to char
public class str2 {
	 public static void main(String args[])
	   {
	      // Using charAt() method
	      String str = "Hello";
	      for(int i=0; i<str.length();i++){//str.charAt(i)
	        char ch = str.charAt(i);
	        System.out.println("Character at "+i+" Position: "+ch);
	      } 
	   }
}

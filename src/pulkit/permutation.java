package pulkit;
import java.util.*;
public class permutation {
	 
		  
	    // Function to print all the permutations of str 
	    static void printPermutn(String str, String ans) 
	    { 
	  System.out.println("ans:"+ans);
	        // If string is empty 
	        if (str.length() == 0) { 
	            System.out.print(ans + ":"); 
	            return; 
	        } 
	  
	        for (int i = 0; i < str.length(); i++) { 
	  
	            // ith character of str 
	        	 System.out.println("str"+str);
	            char ch = str.charAt(i); 
	            	System.out.println("char at i"+i+":"+ch);
	            // Rest of the string after excluding  
	            // the ith character  ros=rest of the string;
	          
	           System.out.println("sub i+1:"+str.substring(i+1));
	            String ros = str.substring(0, i) +  
	                         str.substring(i + 1);
	           System.out.println("i:"+i);
	            System.out.println("ros:"+ros);
	  
	            // Recurvise call 
	            printPermutn(ros, ans + ch); 
	            
	        } 
	    } 
	  
	    // Driver code 
	    public static void main(String[] args) 
	    { 
	    	Scanner sc=new Scanner(System.in);
	        String s = sc.next(); 
	        printPermutn(s, ""); 
	    } 
	
}

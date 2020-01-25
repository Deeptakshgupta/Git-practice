package pulkit;
//import java.util.Stack;
import java.util.Scanner;
/*class strpalindromeTest {

    public static void main(String[] args) {

    	System.out.print("Enter any string:");
        Scanner in=new Scanner(System.in);
        String inputString = in.nextLine();
        Stack stack = new Stack();

        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        String reverseString = "";

        while (!stack.isEmpty()) {
            reverseString = reverseString+stack.pop();
        }

        if (inputString.equals(reverseString))
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}*/
//import java.util.*;
/*
class strpalindromeTest{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n,i,j=0;
        n=s.nextInt();
        String str;
        for(i=0;i<n;i++){
            str=s.next();
            
            for(i=0;i<n/2;i++){
                if(str.charAt(i)!=str.charAt(n-i-1))
                j=1;
            }
            if(j==0)
            {System.out.print("YES");
                if(str.length()%2==0)
                System.out.println("EVEN");
                else
                System.out.println("ODD");
            }
            else
            System.out.println("NO");
        }
    }
}*/
//import java.util.*;
class strpalindromeTest{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n,i,j=0;
        n=s.nextInt();
        String str;
        for(i=0;i<n;i++){
            str=s.next();
            
            for(i=0;i<n/2;i++){
                if(str.charAt(i)!=str.charAt(n-i-1))
                j=1;
            }
            if(j==0)
            {System.out.print("YES");
                if(str.length()%2==0)
                System.out.println("EVEN");
                else
                System.out.println("ODD");
            }
            else
            System.out.println("NO");
        }
    }
}

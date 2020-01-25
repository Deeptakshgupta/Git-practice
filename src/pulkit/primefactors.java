//prime factors within given range
package pulkit;

import java.io.*;
import java.util.*;


public class primefactors {

    /*
     * Complete the primeCount function below.
     */
      static int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
       static int primeCount(long n) {


    if(n==1) return 0;
    long multi = 1;
    int count =0;
    for(int i =0;i<primes.length;i++){  //PRIMES.LENGTH IS A BUILT IN FUNCTION TO GET THE PRIME

          multi*=primes[i];
          if(multi<=n) count ++;
          else break;
  }
  return count;
}    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(scanner.nextLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            long n = Long.parseLong(scanner.nextLine().trim());

            int result = primeCount(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}


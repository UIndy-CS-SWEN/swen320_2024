package swe320;

//Can be run from command line
//See NumZeroTest.java for JUnit tests

public class NumberZero {
	  /**
	   * Counts zeroes in an array
	   * @param x  array to count zeroes in
	   * @return   number of occurrences of 0 in x
	   * @throws   NullPointerException if x is null
	   */
	   public static int countZero (int[] x) {  
	      int count = 0;
	      for (int i = 1; i < x.length; i++) {
	         if (x[i] == 0) count++;
	      }
	      return count;
	   }

	   public static void main (String []argv) {  
	      int[] inArr = new int [argv.length];
	      if (argv.length == 0) {
	         System.out.println ("Usage: java NumberZero v1 [v2] [v3]...");
	         return;
	      }
	   
	      for (int i = 0; i< argv.length; i++) {
	         try {
	            inArr [i] = Integer.parseInt (argv[i]);
	         } catch (NumberFormatException e) {
	            System.out.println ("Entry must be a integer, using 1.");
	            inArr [i] = 1;
	         }
	      }
	      System.out.println ("Number of zeros is: " + countZero (inArr));
	   }
}

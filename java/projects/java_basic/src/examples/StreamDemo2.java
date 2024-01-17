package examples;

import java.util.*;
import java.util.stream.*;
  
class StreamDemo2 {
  public static void main(String args[]) {
  
    // use an array to create a list of integers
	Integer a[] = new Integer[] {1, 2, 3, 4};
    List<Integer> number = Arrays.asList(a);
  
    //forEach method
    number.stream().map(x->x*x).forEach(y->System.out.println(2*y));
    
    //reduce method => initial value 0, result = result+element i value
    int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
    System.out.println(even);
  }
}

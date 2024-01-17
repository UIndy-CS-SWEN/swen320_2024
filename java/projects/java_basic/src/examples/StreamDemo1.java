package examples;

import java.util.*;
import java.util.stream.*;
  
class StreamDemo1{
  public static void main(String args[]) {
  
    // create a list of integers
    List<Integer> number = Arrays.asList(1, 2, 3, 4);
    List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
    System.out.println(square);
    
    // collect method returns a set
    Set<Integer> squareSet = number.stream().map(x->x*x).collect(Collectors.toSet());
    System.out.println(squareSet);
  
    // use an array to create a list of String
    String strArray[] = new String[]{"Student", "School", "Teacher", "Assistant"};
    List<String> strs = Arrays.asList(strArray);
    List<String> onlyStartWithS = strs.stream().filter(s->s.startsWith("S")).
                          collect(Collectors.toList());
    System.out.println(onlyStartWithS);
  }
}

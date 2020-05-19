package basic.strings;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateChar {

      public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          System.out.println("Enter any String::");

          String input = scn.nextLine();

          char[] s2 = input.toCharArray();

          input.chars().mapToObj(c -> (char) c).distinct().sorted().forEach(System.out::print);

      }
}

    /*public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String s = sc.next();
        char[] ar = s.toCharArray();
        int len = ar.length;
        int j,k=0;
        Set<Character> set = new HashSet<Character>();
        Map<Character,Integer> m = new HashMap<>();
        for( int i = 0; i<len; i++ ){
            boolean b = set.add(ar[i]);
            if(!b){
                if(m.containsKey(ar[i])){
                    j = m.get(ar[i]);
                    m.put(ar[i],j++);
                    System.out.println(j);
                }
                else{
                    //k=m.get(ar[i]);
                    m.put(ar[i],1);
                    //System.out.println(k);
                }
            }
        }
        System.out.println(m);
    }*/

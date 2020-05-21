package Java8.Function;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FunctionImpl {
    /*//T->input type,R->return type
    * interface Function<T,R>{
    *   R apply(T t);
    * }*/

    public static void main(String[] args) {
        System.out.println(Arrays.asList("abcd","def","kdsdas").stream().map(s->s.length()).collect(Collectors.toList()));
    }
}



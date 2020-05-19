package Java8.Stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Peek {
    public static void main(String[] args) {
        /*this method exist only for debugging
        * where you want to see the elements as they flows past certain point*/
        Arrays.asList("a","bb","c","dd","e")
                .stream()
                .filter(i->i.length()>1)
                .peek(i-> System.out.println(i))
                .map(String::toUpperCase)
                .peek(i-> System.out.println(i))
                .collect(Collectors.toList());
    }
}

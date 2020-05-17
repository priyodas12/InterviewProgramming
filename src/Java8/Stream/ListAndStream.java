package Java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListAndStream {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);

        //list.stream().forEach(System.out::println);

        //to pick particular element as per condition and do operation.
        //list.stream().filter(e->e>=5).forEach(System.out::println);

        //to pick each element and do operations
        //list.stream().map(e->e*

        //generating a stream.
        /*Stream<Double> streamGenerated =
                Stream.generate(() -> Math.random()*100).limit(10);
        streamGenerated.forEach(System.out::println);*
         */

        //get accumulation value
        int add= list.stream().map(e->e).reduce(0,Integer::sum);
        System.out.println(add);

    }
}

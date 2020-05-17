package Java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListAndStream {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);

        //list.stream().forEach(System.out::println);

        //list.stream().filter(e->e>=5).forEach(System.out::println);

        //list.stream().map(e->e*2).forEach(System.out::println);
        /*Stream<Double> streamGenerated =
                Stream.generate(() -> Math.random()*100).limit(10);
        streamGenerated.forEach(System.out::println);*/


    }
}

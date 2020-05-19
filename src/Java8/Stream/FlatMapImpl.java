package Java8.Stream;
/*combination of transforms of values as well as flattening the values
*
* map+flattening
* */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapImpl {

    public static void main(String[] args) {
        List<String> words= Arrays.asList("java","scala","c#","Es6","ruby","pearl");

        //tae each element and process as per function
        List<Integer> word_length=words.stream().map(i->i.length()).collect(Collectors.toList());

        word_length.forEach(System.out::println);

        //now process unique word in the list so here output will be List<String[]>
        //map will produce List<String> to List<String[]>
        System.out.println(words.stream().map(e->e.split("")).distinct().collect(Collectors.toList()));

        System.out.println(words.stream()
                .map(e->e.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList()));

    }
}

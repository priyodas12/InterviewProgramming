package Java8.Stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsGroupingBy {
    public static List<Person> createPeople(){
        return List.of(
                new Person("abc",20),
                new Person("bca",91),
                new Person("abc",9),
                new Person("def",18),
                new Person("bca",13),
                new Person("abc",7)
        );
    }

    public static void main(String[] args) {
        Map<String,List<Person>> map=
                 createPeople()
                .stream()
                .collect(Collectors.groupingBy(person->person.getName()));

        System.out.println(map);
    }
}

package Java8.Stream;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsList {
    public static List<Person> createPeople(){
        return List.of(
                new Person("abc",20),
                new Person("bca",91),
                new Person("bcxa",9),
                new Person("bcma",18),
                new Person("bvca",13),
                new Person("bica",7)
        );
    }

    public static void main(String[] args) {
        List<Integer> list=createPeople()
                                        .stream()
                                        .map(Person::getAge)
                                        //.collect(Collectors.toList());//still immutable
                                        .collect(Collectors.toUnmodifiableList());

       // list.add(93);
        System.out.println(list);
        System.out.println(list.getClass());

    }
}

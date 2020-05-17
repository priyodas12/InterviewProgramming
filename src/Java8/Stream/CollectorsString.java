package Java8.Stream;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsString {
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
        System.out.println(createPeople()
                .stream()
                .filter(person->person.getAge()<40)
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(Collectors.joining(",")));
    }
}

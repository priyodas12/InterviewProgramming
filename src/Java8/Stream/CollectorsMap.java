package Java8.Stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsMap {
    public static List<Person> createPeople(){
        return List.of(
                new Person("abcd",20),
                new Person("jbcag",91),
                new Person("dbcxa",9),
                new Person("lbcma",18),
                new Person("vbvca",13),
                new Person("xbica",7)
        );
    }
    public static void main(String[] args) {

        //imperative style:wrong approach
        Map<String,Integer> maps=new HashMap<>();

        for(Person persons: createPeople()){
            maps.put(persons.getName(),persons.getAge());
        }

        //right approach
        System.out.println(createPeople()
                                        .stream()
                                        .collect(Collectors.toMap(Person::getName,Person::getAge))
                            );

        System.out.println(maps);

    }
}

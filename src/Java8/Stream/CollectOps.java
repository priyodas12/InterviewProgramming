package Java8.Stream;

import java.util.ArrayList;
import java.util.List;

public class CollectOps {

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
        //Object oriented programming: polymorphism

        //Functional Programming: functional composition + lazy evaluation(GC problem solved | performance increase)

        //String name=createPeople().stream().map(p->p.getName()+" ").reduce("",String::concat);
        //System.out.println(name);

        //find out ppl whose age are less than 90
        //wrong approach
        /*List<String> persons=new ArrayList<>();

        createPeople()
                .stream()
                .filter(p->p.getAge()<90)
                .map(p->p.getName())
                .map(String::toUpperCase)
                .forEach(person->persons.add(person));

        System.out.println(persons);*/

        //right approach


    }
}

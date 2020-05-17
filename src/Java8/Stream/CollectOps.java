package Java8.Stream;

import java.util.List;

public class CollectOps {

    public static List<Person> createPeople(){
        return List.of(
                new Person("abc",20),
                new Person("bca",91),
                new Person("bca",9),
                new Person("bca",18),
                new Person("bca",13),
                new Person("bca",7)
        );
    }

    public static void main(String[] args) {
        String name=createPeople().stream().map(p->p.getName()+" ").reduce("",String::concat);
        System.out.println(name);
    }
}

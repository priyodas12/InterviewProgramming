package Java8.Predicate;

import java.util.Arrays;
import java.util.stream.Collectors;

//predicate is a functional interface which having single abstract method test(); return boolean

/*
* interface Predicate<T>{
*   boolean test(condition checking of T element)
* }*/
public class PredicateImpl {

    //filter always checks boolean condition:
    public static void main(String[] args) {
        System.out.println(Arrays.asList(1,2,3,4,7,5,9,6).stream().filter(i->i%3==0).collect(Collectors.toList()));
    }
}

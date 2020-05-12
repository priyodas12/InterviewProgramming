package Java8.FunctionalInterface;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(91,92,93,49,94,95,99,109);

        list.forEach(System.out::println);//instance ref

        //list.stream().map(String::valueOf).forEach(System.out::println);
        //static ref
       //list.stream().map(e->String.valueOf(e)).forEach(System.out::println);
       // list.stream().map(e->e.toString()).forEach(System.out::println);
        list.stream().map(e->e.toString()).map(String::toCharArray).forEach(System.out::println);
    }

}

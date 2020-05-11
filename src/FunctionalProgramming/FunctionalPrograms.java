package FunctionalProgramming;

import java.util.Optional;

public class FunctionalPrograms {
    public static void main(String[] args) {
        Optional<Object> empty=Optional.empty();
        System.out.println(empty.isEmpty());
        System.out.println(empty.isPresent());
    }
}

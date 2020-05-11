package FunctionalProgramming;

import java.util.Optional;

public class FunctionalPrograms {
    public static void main(String[] args) {
        Optional<String> empty=Optional.of("priyo");
        System.out.println(empty.isEmpty());
        System.out.println(empty.isPresent());

        String orELse=empty.orElse("abdf");
        System.out.println(orELse);
    }
}

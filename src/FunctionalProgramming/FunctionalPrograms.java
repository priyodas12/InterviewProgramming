package FunctionalProgramming;

import java.util.Optional;

public class FunctionalPrograms {
    public static void main(String[] args) {
        Optional<String> name=Optional.of("priyo");
        Optional<String> name2=Optional.ofNullable(null);

        System.out.println(name.isEmpty());
        System.out.println(name.isPresent());

        String orELse=name.orElse("abdf");
        System.out.println(orELse);

        //String orELse2=name2.orElse("abdf");
        System.out.println(name2);
    }
}

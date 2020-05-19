package Java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacter {

    public static void main(String[] args) {
       String s="asjklkaskd";
        Map<Character, Integer> charToInt = s.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.toMap(c -> c, c -> s.indexOf(c)));
    }
}

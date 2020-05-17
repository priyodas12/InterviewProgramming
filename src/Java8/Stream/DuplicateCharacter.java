package Java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacter {

    public static void main(String[] args) {
       String s="asjklkaskd";
       char [] chars=s.toCharArray();
       //Arrays.asList(chars).stream().collect(Collectors.toMap(Character::charValue,char));
    }
}

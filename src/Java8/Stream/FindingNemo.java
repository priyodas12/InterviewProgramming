package Java8.Stream;

import java.util.Arrays;
import java.util.List;

public class FindingNemo {

    public static Boolean findingNemo(List<String> names){
        return names.contains("nemo");
    }

    public static void main(String[] args) {
        List<String> names= Arrays.asList("abc","def","nemo","sksd");

        System.out.println(findingNemo(names));

    }
}

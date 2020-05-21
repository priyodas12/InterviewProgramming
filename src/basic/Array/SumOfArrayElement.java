package basic.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class SumOfArrayElement {
    public static void main(String[] args) {

        Integer [] numbers= new Integer[]{3,1,4,2,8,0};

        List<Integer> sortedNumbers=new ArrayList<>();

        int addedValue= Arrays.asList(numbers).stream().reduce(0,Integer::sum);

        int addedValue2= Arrays.asList(numbers).stream().collect(Collectors.summingInt(Integer::intValue));

        System.out.println(addedValue +","+ addedValue2);

    }
}

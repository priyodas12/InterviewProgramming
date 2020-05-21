package basic.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortIntegerArray {
    public static void main(String[] args) {
        Integer [] numbers= new Integer[]{3,1,4,2,8,0};

        List<Integer> sortedNumbers=new ArrayList<>();

        sortedNumbers=Arrays.asList(numbers).stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        //primitive type
        //int [] sortedArray=sortedNumbers.stream().mapToInt(Integer::intValue).toArray();

        //wrapper/immutable type
        Integer [] sortedArray=new Integer[sortedNumbers.size()];

       //System.out.println(Arrays.toString(sortedArray));

        sortedArray=sortedNumbers.toArray(sortedArray);

        System.out.println(Arrays.toString(sortedArray));

    }
}

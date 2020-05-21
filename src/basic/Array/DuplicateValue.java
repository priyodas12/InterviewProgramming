package basic.Array;

import java.util.Arrays;

public class DuplicateValue {
    public static void main(String[] args) {
        Integer [] numbers= new Integer[]{3,1,4,2,8,0,4,0};

        Arrays.asList(numbers).stream().filter(i->i%2==0);
    }
}

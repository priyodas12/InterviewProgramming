package Java8.Function;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
* if two Function f1,f2 is there
*
* f1.andThen(f2) -->f1 will be applied first before f2;
*
* f1.compose(f2) -->f2 will be applied first before f1;
* */
public class FunctionChainImpl {
    public static void main(String[] args) {

        Function<String,String> f1=s->s.toUpperCase();
        Function<String,String> f2=s->s.substring(1,3);

        System.out.println(Arrays.asList("abcdss","deffg","kdsdas").stream().map(f1.compose(f2)).collect(Collectors.toList()));
    }
}

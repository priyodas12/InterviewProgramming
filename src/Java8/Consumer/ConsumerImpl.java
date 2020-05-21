package Java8.Consumer;

/*return nothing
* interface Consumer<T>{
*       void Accept(T t);
* }
* */

import java.util.function.Consumer;

public class ConsumerImpl {
    public static void main(String[] args) {
        Consumer<String> c=s-> System.out.println(s);

        c.accept("Hello Consumer Interface");
    }
}

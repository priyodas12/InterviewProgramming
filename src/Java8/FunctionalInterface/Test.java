package Java8.FunctionalInterface;

import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    public static void main(String[] args) {
        AtomicInteger i=new AtomicInteger(0);
        for(int k=0;k<10;k++){
            i.getAndIncrement();
            System.out.println(i);
        }
        System.out.println(i);
    }
}

package Java8.FunctionalInterface;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class CalculateRent {

    int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) {

        ExecutorService thread= Executors.newFixedThreadPool(5);

        CalculateRent c1=new CalculateRent();
        c1.setPrice(1000);
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<13;i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    c1.price+=i*(.05)*c1.getPrice();
                    System.out.println(c1.price);
                }
            }
        };

        thread.submit(r1);


    }
}

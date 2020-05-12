package Java8.FunctionalInterface;
//single abstract method:functional interface
public class ThreadUtil {

    public static void main(String[] args) {
        Thread t1=new Thread(()-> {for(int i=0;i<10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("in t1");
        }});
        t1.start();
        System.out.println("in Main");
    }
}

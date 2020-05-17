package Thread.synchonizatioImpl;

public class SynchronizationProblem {

    private volatile int count=0;

    public void doCount(){
       Thread t1= new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for(int i=0;i<10000;i++){

                            count++;
                        }
                    }
                }
        );

        Thread t2=new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for(int i=0;i<10000;i++){

                            count++;
                        }
                    }
                }
        );
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        SynchronizationProblem sp=new SynchronizationProblem();
        sp.doCount();
    }
}

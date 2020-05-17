package Thread.synchonizatioImpl;

public class SynchronizationProblem {

    private  int count=0;

    private synchronized  void increment(){
        count++;
        //System.out.println(Thread.currentThread().getName()+" >> "+count);
    }
    public static void main(String[] args) {
        SynchronizationProblem sp=new SynchronizationProblem();

        Thread t1= new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for(int i=0;i<10000;i++){
                           sp.increment();
                        }
                    }
                }
        );

        Thread t2=new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for(int i=0;i<10000;i++){
                            sp.increment();
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

        System.out.println(sp.count);
    }
}

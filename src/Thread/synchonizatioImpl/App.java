package Thread.synchonizatioImpl;

import java.util.Date;
import java.util.Scanner;

class Process extends Thread{
    public boolean isRunning=true;

    @Override
    public void run() {
        while(isRunning){
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("now "+new Date()+" "+Thread.currentThread().getName());

        }
    }

    public void shutDown(){
        isRunning=false;
    }
}

public class App {
    public static void main(String[] args) {

        Process prc=new Process();
        prc.start();

        System.out.println("Press Return to Stop!");
        Scanner scn=new Scanner(System.in);
        scn.nextLine();

        prc.shutDown();


    }
}

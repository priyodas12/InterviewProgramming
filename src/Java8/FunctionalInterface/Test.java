package Java8.FunctionalInterface;

public class Test {
    public static void main(String[] args) {
        int i=0;
        for(int k=0;k<10;k++){
            i=i++;
            System.out.println(i);
        }
        System.out.println(i);
    }
}

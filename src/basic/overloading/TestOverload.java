package basic.overloading;

public class TestOverload {

    public int getOutput(int a, int b){
        return a+b;
    }
    public int getOutput(int a,double b){
        return a*(int)b;
    }

    public static void main(String[] args) {
        TestOverload t1=new TestOverload();
        System.out.println(t1.getOutput(100, 200.00));
    }
}

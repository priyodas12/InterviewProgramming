package InnerClass.MethodLocalInner;

class Outer {
    int outerVar=10;
    void outerMethod(){
        int outerMethodVar=100;
        System.out.println("inside outer method!");
        class Inner{
            void innerMethod(){
                System.out.println("inside inner method!, can access outer class variable >>"+outerVar+","+outerMethodVar);

            }
        }
        Inner i=new Inner();
        i.innerMethod();
    }
}


public class MethodLocalMain {
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.outerMethod();
    }
}

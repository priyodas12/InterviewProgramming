package InnerClass.StaticNested;
/*
1) static classes can access the static variables from outer class
2) static classes can be treated like an independent class
*/

public class Outer {
    private static void outerMethodInfo(){
        System.out.println("from Outer Method Info..");
    }
    static class Inner {
        public static void main(String[] args) {
            System.out.println("from Inner Method...");
            outerMethodInfo();
        }
    }
}

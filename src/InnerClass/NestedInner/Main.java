package InnerClass.NestedInner;

/*
Inner class means one class which is a member of another class.
Nested Inner class can access any private instance variable of outer class.
Like any other instance variable,
we can have access modifier private, protected, public and default modifier.

Advantages::
It is a way of logically grouping classes that are only used in one place.
It increases encapsulation.
*/

 class Outer {

     public static  void info2() {
         System.out.println("static methods from Outer class");
     }

     public class Inner{
        public void info() {
            System.out.println("from Inner class");
        }

        /* static method not allowed inside Inner Class
        public static  void info2() {
            System.out.println("static methods from Inner class");
        }
        */
     }
}
public class Main {
    public static void main(String[] args) {

        Outer.Inner inner=new Outer().new Inner();
        inner.info();
        Outer.info2();
    }
}

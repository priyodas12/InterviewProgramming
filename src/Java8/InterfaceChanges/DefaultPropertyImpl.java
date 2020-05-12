package Java8.InterfaceChanges;

public class DefaultPropertyImpl  implements  DefaultProperty ,DefaultPropertyNew{

    @Override
    public void m3() {
        //you may or may not implement this method.
        //System.out.println("overridden default method!");
        DefaultProperty.super.m3();
        DefaultPropertyNew.super.m3();
    }

    @Override
    public void m4() {
        System.out.println("implemented default method!");
    }
}

package Java8.InterfaceChanges;

public class TestStaticProperty {
    public static void main(String[] args) {
        StaticProperty s1=new StaticPropertyImpl();
        s1.m2();
        StaticProperty.m1();
        StaticProps.m1();
    }
}

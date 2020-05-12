package Java8.InterfaceChanges;

public interface StaticProps extends StaticProperty{

    static void m1(){
        System.out.println("this is static method from extended interface");
    }
}

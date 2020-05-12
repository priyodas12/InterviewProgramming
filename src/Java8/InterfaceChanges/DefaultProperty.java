package Java8.InterfaceChanges;

public interface DefaultProperty {

    /*
    * if DefaultProperty is implemented by 100 classes and if we add another method in this
    * interface we have to explicitly do implementation over.
    *
    */
    default void m3(){
        System.out.println("interface default method! old");
    }
    void m4();


}

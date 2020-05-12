package Java8.InterfaceChanges;

/*Allows many classes access to behaviour that isn't dependent on an instance of any of them

  Grouping together stateless utility methods in a helper class makes it clear what's happening and
  creates a class that is cohesive (all methods doing related work) and coherent
  (consistent use of parameters and return types).

  Might possibly give performance advantages because static methods never need a null check and are
  always candidates for inlining - but the Hotspot JVM is so good at these that this is only worth
  worrying about in extreme cases.
*/

public interface StaticProperty {

    static void m1(){
        System.out.println("this is static method of interface");
    }

    void m2();
}

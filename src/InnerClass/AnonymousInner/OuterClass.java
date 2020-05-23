package InnerClass.AnonymousInner;

abstract class AnonymousInner{
    public abstract void innerMethod();
}

public class OuterClass {
    public static void main(String[] args) {
       AnonymousInner anonymousInner=new AnonymousInner() {
           @Override
           public void innerMethod() {
               System.out.println("implemented Inner Method in anonymous");
           }
       };

       anonymousInner.innerMethod();
    }
}

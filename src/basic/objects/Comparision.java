package basic.objects;

public class Comparision {
    public static void main(String[] args) {

        Student s1=new Student(12,"abc");
        Student s2=new Student(10,"bca");

        int result=s1.compareTo(s2);
        if(result<0){
            System.out.println(s1.getName()+" will come before "+s2.getName());
        }
        else if(result>0){
            System.out.println(s1.getName()+" will come after "+s2.getName());
        }
        else{
            System.out.println("both are equal");
        }

    }
}

package FunctionalProgramming;

public class Test {
    public static void main(String[] args) {
       Student s1= new Student("abcd","ABCD@gmail.com");
        System.out.println(s1.getEmail().isEmpty());
    }
}

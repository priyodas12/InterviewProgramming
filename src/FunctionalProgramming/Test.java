package FunctionalProgramming;

public class Test {
    public static void main(String[] args) {
       Student s1= new Student("abcd","Abcd@gmail.in");
        System.out.println(s1.getEmail().map(String::toLowerCase).orElse("Email Not Found"));
    }
}

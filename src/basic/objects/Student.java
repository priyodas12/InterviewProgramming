package basic.objects;
//default natural sorting order.
public class Student implements  Comparable{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Student s1=(Student)o;
//        if(this.getId()<((Student) o).getId()) return -1;
//        if(this.getId()>((Student) o).getId()) return +1;
//        else return 0;
        return this.getName().compareTo(((Student) o).getName());
    }
}

package basic.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparisonByComparator {

    public static void main(String[] args) {
        List<Employee> list=new ArrayList<Employee>();

        list.add(new Employee(101,"sjkla"));
        list.add(new Employee(19,"kalaa"));
        list.add(new Employee(91,"klasa"));
        list.add(new Employee(71,"dfmra"));

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                //sort by emp name
                return o1.getEmpName().compareTo(o2.getEmpName());
                //sort by emp id
                //return o1.getEmpId()-o2.getEmpId()
            }
        });

        list.stream().forEach(a-> System.out.println(a.empId+","+a.empName));

    }
}

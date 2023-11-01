package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrincipalOffice {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(22,"Durgesh","CSE"));
        students.add(new Student(21,"Abhinandan","ECE"));
        students.add(new Student(24,"Jagannath","Mechanical"));
        students.add(new Student(23,"Deepak","EE"));

        System.out.println("Before Sorting" +students);
        Collections.sort(students);
        System.out.println("After sorting" +students);
    }
}

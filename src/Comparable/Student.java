package Comparable;

public class Student implements Comparable<Student>{

    private int age;
    private String name;
    private String branch;

    public Student(int age,String name,String branch) {
        this.age = age;
        this.name = name;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Student o2) {
//        return this.age - o2.age;
//    }
    /*  If namewise we want to sorting.
    *
     */
    @Override
    public int compareTo(Student o3) {
        return this.name.compareTo(o3.name);
    }
}

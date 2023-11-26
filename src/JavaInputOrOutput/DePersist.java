package JavaInputOrOutput;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DePersist {
    public static void main(String[] args) throws Exception {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Test.txt"));
        Student student = (Student)objectInputStream.readObject();
        System.out.println(student.id+" "+student.name+" "+student.age);
        objectInputStream.close();
        System.out.println("Success");
    }
}

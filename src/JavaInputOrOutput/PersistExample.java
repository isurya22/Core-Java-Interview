package JavaInputOrOutput;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PersistExample {
    public static void main(String[] args) throws Exception {
        Student student = new Student(63,"Surya",29);
        FileOutputStream fileOutputStream = new FileOutputStream("Test.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("Success");
    }
}

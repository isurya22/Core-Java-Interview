package Lambda.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookService {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(101,"Core Java",400));
        bookList.add(new Book(363,"Algebra",180));
        bookList.add(new Book(275,"Spring",200));
        bookList.add(new Book(893,"JDBC",300));

        System.out.println(bookList);
        Collections.sort(bookList,(o1,o2)-> o1.getName().compareTo(o2.getName()));

        System.out.println("After sorting: ");
        System.out.println(bookList);

//        for (Book book :bookList) {
//            System.out.println(book.getName());
//        }

    }
}

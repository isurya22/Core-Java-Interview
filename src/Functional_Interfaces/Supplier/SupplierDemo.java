package Functional_Interfaces.Supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {
    @Override
    public String get() {
        return "Hi Rakesh";
    }

    public static void main(String[] args) {
        SupplierDemo supplierDemo = new SupplierDemo();
        System.out.println(supplierDemo.get());
    }
}

//Now using lambda expression
class SupplierDemo1 {
    public static void main(String[] args) {
        Supplier<String> h = ()-> "Maa Radha";
        System.out.println(h.get());
    }
}

//Using stream
class SupplierDemo2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList() ; // Here we make list empty
        System.out.println(list.stream().findAny().orElseGet(()->"God is kind"));
    }
}

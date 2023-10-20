package Exception;

public class OrderNotFoundException extends RuntimeException { //If you write Exception then it will checked(Compile time) Exception.

    public OrderNotFoundException(String message) {
        super(message);
    }
}

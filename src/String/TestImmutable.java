package String;

public class TestImmutable {
    public static void main(String[] args) {
        String s = "Java";
        s.concat(" Force"); // concat() is used to append at the end.
        System.out.println(s); // return only Java

        String password = "pwd";
        password.concat("123");
        System.out.println(password); //Return only pwd
    }

}
/** Immutable means cannot changeable.
 *
 *  String pool is possible only because String is immutable in java.
 *  This way java Runtime saves a lot of heap space because different String variables can refer to the same String variable in the pool.
 *
 *  If String is not immutable then it would cause a severe security threat to the application.
 *  For example, database username,password are passed as String to get database connection and in socket progarmming host and port details passsed as String.
 *  Since String is immutable,it's value can't be changed otherwise any hacker could change the referenced value to cause security issues in the application.
 *
 *  Since String is immutable, it is safe for multithreading.A single String instance can be shared across threads.
 *  This avoids the use of synchronization for thread safety.
 *
 *  Since String is immutable,its hashcode is cached at the time of creation and it doesn't need to be calculated again.
 *  This makes it a great candidate for the key in a map and its processing is faster then other HashMap key objects.
 *  This is why String is the most widely used as HashMap keys.
 *
 */
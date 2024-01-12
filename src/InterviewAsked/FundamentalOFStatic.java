package InterviewAsked;

public class FundamentalOFStatic {

    static int age = 18;

    public static void home(){
        System.out.println("This is static method");
    }

    static {
        System.out.println("This is static block");
    }

    public static void main(String[] args) {
        //FundamentalOFStatic.home();
        System.out.println(age);
    }
}

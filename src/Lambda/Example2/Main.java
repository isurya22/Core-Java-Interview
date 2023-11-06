package Lambda.Example2;

public class Main {
    public static void main(String[] args) {
        LengthInter lengthInter = str-> str.length();
        /*  We can write like this.
            LengthInter lengthInter = (String str)->{
            return str.length();
        };
         */
        System.out.println(lengthInter.getLength("JayJagannath"));
        System.out.println(lengthInter.getLength("MaaMangala"));
    }
}

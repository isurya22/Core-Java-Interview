package String;

public class ReverseString
{
    public static void main(String[] args) {
        String original = "Hello";
        String reverseString = "";
        System.out.println("Original value: "+original);
        for(int i = 0; i < original.length(); i++)
        {
            reverseString  = original.charAt(i) + reverseString;

        }
        System.out.println("Reverse value: "+reverseString);

    }
}

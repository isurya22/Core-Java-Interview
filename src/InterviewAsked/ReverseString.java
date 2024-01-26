package InterviewAsked;

public class ReverseString {
    public static void main(String[] args) {
        String word = "BALL";

        ReverseString.reverseProcess(word);
    }
    public static void reverseProcess(String w){
        String reverseWord = "";
     for(int i = w.length()-1; i>=0 ; i--){
         reverseWord += w.charAt(i);
     }
        System.out.println("ReverseWord :"+reverseWord);
    }
}

package InterviewAsked;

public class FindLargestWord {
    public static void main(String[] args) {
        String a = "india is our country and we love it";
        maxLengthWord(a);
        System.out.println("Maximum length word : "+ maxWord);

    }
    static String maxWord = "";

    public static void maxLengthWord(String input){
        int len = input.length();
        int si = 0 , ei = 0;
        int max_length = 0, max_start_index = 0;

        while(ei <= len){
            if(ei < len && input.charAt(ei) != ' '){
                ei++;
            }
            else{
                int curr_length = ei-si;
                if(curr_length > max_length){
                    max_length = curr_length;
                    max_start_index = si;
                }
                ei++;
                si = ei;
            }
        }
        maxWord = input.substring(max_start_index,max_start_index+max_length);
    }
}

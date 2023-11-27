package InterviewAsked;

public class ReplaceAllVowelsIntoCapitalCase {
    public static void main(String[] args) {
        String s = "intelcore";
        upperCase(s.toCharArray());

    }
    static void upperCase(char[] str){
        int n = str.length;
        for(int i = 0; i<n;i++) {
            if(str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u')
            {
                char c = Character.toUpperCase(str[i]);
                str[i] = c;
            }
        }
        for(char c : str)
            System.out.print(c);
    }
}

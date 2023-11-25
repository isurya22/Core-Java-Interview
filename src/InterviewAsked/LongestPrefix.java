package InterviewAsked;

import java.util.Arrays;

public class LongestPrefix {
    /*find the longest common prefix string among an array of strings
    Input: ["flower", "flow", "flight"]
    Output : fL
    L1- Altimetrik

     */
    public String longPrefix(String[] a){
        int size = a.length;

        if(size == 0)
            return "";
        if(size == 1)
            return a[0];

        Arrays.sort(a);

        int end = Math.min(a[0].length(), a[size-1].length());
        int i =0;
        while(i < end && a[0].charAt(i) == a[size-1].charAt(i)) {
            i++;
        }
        String pre =a[0].substring(0, i);
        return pre;
    }

    public static void main(String[] args) {
        LongestPrefix test = new LongestPrefix();
        String[] input = {"flower", "flow", "floght"};
        System.out.println(test.longPrefix(input));
    }
}

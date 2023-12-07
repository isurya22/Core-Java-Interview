package InterviewAsked;

//Length of the longest substring without repeating characters
/*
   #Using this solution the problem can be solved in linear time using the window sliding technique.
   Follow the steps below to solve the problem:

Intialize two pointers left and right with 0, which define the current window being considered.
The right pointer moves from left to right, extending the current window.
If the character at right pointer is not visited , it’s marked as visited.
If the character at right pointer is visited, it means there is a repeating character. The left pointer moves to the right while marking visited characters as false until the repeating character is no longer part of the current window.
The length of the current window (right - left + 1) is calculated and answer is updated accordingly.
 */

public class LongestSubString {
    public static int longestUniqueSubstrr(String s){
        // if string length is 0
        if(s.length() == 0)
            return 0;
        // if string length 1
        if(s.length() == 1)
            return 1;
        // if string length is more than 2
        int maxLength = 0;
        boolean[] visited = new boolean[256];

        // left and right pointer of sliding window
        int left = 0, right = 0;
        while(right < s.length()) {

            // if character is visited
            if(visited[s.charAt(right)]) {
                // The left pointer moves to the right while
                // marking visited characters as false until
                // the repeating character is no longer part
                // of the current window.
                while(visited[s.charAt(right)]){
                    visited[s.charAt(left)] = false;
                    left++;
                }
            }

            visited[s.charAt(right)] = true;

            // The length of the current window (right -
            // left + 1) is calculated and answer is updated
            // accordingly.

            maxLength = Math.max(maxLength,(right - left + 1));
            right++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "suryanarayan";
        int len = longestUniqueSubstrr(s);
        System.out.println(len);
    }
}

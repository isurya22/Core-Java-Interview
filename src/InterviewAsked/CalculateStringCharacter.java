package InterviewAsked;

import java.util.Arrays;
import java.util.Comparator;

/*
String[] str = {"I", "AM", "LARGEST", "WORD"};
7 : LARGEST
4 : WORD
2 : AM
1 : I
 */
public class CalculateStringCharacter {
    public static void main(String[] args) {
        String[] str = {"I", "AM", "LARGEST", "WORD"};
        Arrays.stream(str).sorted(Comparator.comparingInt(String::length).reversed()).forEach(a-> System.out.println(a.length()+":"+a));
    }

}

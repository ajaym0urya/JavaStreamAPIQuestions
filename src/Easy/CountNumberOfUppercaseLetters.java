package Easy;

import java.util.List;
import java.util.stream.Collectors;

public class CountNumberOfUppercaseLetters {
    public static void main(String[] args) {
        // Input: "JavaStreamAPI"
        // Output: 5

        String str="JavaStreamAPI" ;
        long count=  str.chars()           // Convert int to Character
                .filter(Character::isUpperCase)
                 .count();

        System.out.println(count);
    }
}

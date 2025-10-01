import java.util.List;

public class FilterVowelsFromAString {
    public static void main(String[] args) {
        // Input:  "streamapi"
        // Output: [e, a, a, i]

        String str="streamapi" ;
        List<Character> list=  str.chars()
                .mapToObj(c -> (char) c)            // Convert int to Character
                .filter(s -> s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u')
                .toList();

        System.out.println(list);
    }
}

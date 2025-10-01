import java.util.Arrays;
import java.util.List;

public class ConvertToUppercaseAndSort {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("banana", "apple", "cherry");
        List<String> output = input.stream().map(String::toUpperCase).sorted()
                .toList() ;

        System.out.println(output);

    }
}

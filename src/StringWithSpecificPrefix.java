import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringWithSpecificPrefix
{
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Apple", "Avocado", "banana", "apricot", "ALMOND");
        List<String> output = input.stream()
                .filter(s -> s.startsWith("A"))
                        .toList();
        System.out.println(output);
    }
}

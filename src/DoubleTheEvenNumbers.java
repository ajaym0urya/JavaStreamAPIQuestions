import java.util.List;
import java.util.stream.Collectors;

public class DoubleTheEvenNumbers {
    public static void main(String[] args) {
        List<Integer> input = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> result = input.stream().filter(n -> n%2==0 ).map(n -> n*2)
                .collect(Collectors.toList()) ;
        System.out.println(result);
    }
}

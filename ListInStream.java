import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListInStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        Stream<Integer> s1 = list.stream();

        // Stream<Integer> s2=s1.filter(n-> n%2==0);
        // Stream<Integer> s3=s2.map(n-> n*2);
        // int result=s3.reduce(0, (a,c)->a+c);
        // System.out.println(result);


        ////// Same task Using the lanbda expresion
       int result = list.stream()
                .filter( n ->n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (a, e) -> a + e);

        System.out.println(result);
    }
}

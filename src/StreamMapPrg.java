import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMapPrg {

    public static void main(String[] args) {

        int[] arr={5,6,7,8};

        IntStream stream=Arrays.stream(arr);

        Stream<Integer> s=stream.boxed();

        Integer[] res=s.toArray(Integer[]::new);

        System.out.println(Arrays.toString(res));
    }
}

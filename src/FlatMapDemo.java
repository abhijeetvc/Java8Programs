import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapDemo {

    public static void main(String[] args) {
        String[][] data=new String[][]{{"a","b"},{"c","d"},{"e","f"}};

        Stream<String[]> newData= Arrays.stream(data);

        Stream<String> stringStream=newData.flatMap(a->Arrays.stream(a));

       // Stream<String> stream=stringStream.filter(a->"a".equals(a.toString()));
        stringStream.forEach(System.out::println);
    }
}

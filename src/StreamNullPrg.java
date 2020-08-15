import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamNullPrg {

    public static void main(String[] args) {
        Stream<String> data=Stream.of("India","US",null,"France",null,"Germany");
        List<String> list=data.filter(a->a!=null).collect(Collectors.toList());

      //  list.forEach(System.out::println);

        //Stream sorted function
        List<String> list1= Arrays.asList("5","7","2","B","A","b","C","1","a");

        List<String> result=list1.stream().sorted().collect(Collectors.toList());
        result.forEach(System.out::println);


    }
}

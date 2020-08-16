import java.util.stream.Stream;

public class StreamBuilderPrg {

    public static void main(String[] args) {
        Stream.Builder<String> countries=Stream.builder();
        countries.add("India");
        countries.add("US");
        countries.add("France");
     //   System.out.println(countries);
        Stream<String> list= countries.build();
      //  System.out.println(list.toString());
        list.forEach(a-> System.out.println(a));
    }
}

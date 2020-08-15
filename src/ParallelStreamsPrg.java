import java.util.stream.IntStream;

public class ParallelStreamsPrg {

    public static void main(String[] args) {
        System.out.println("Normal ietration");
        IntStream range=IntStream.rangeClosed(1,5);
        range.forEach(System.out::println);

        System.out.println("Parallel iteration");
        IntStream range2=IntStream.rangeClosed(1,5);
        range2.parallel().forEach(System.out::println);
    }
}

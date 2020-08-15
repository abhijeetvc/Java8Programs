import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPrg {

    public static void main(String[] args) {
//        List<String> list= Arrays.asList("India","US","China","France","Australia");
//        List<String> filterList=list.stream()
//                .filter(country->!"China".equals(country))
//                .collect(Collectors.toList());
//
//        filterList.forEach(System.out::println);


        List<String> letters=Arrays.asList("a","b","c","d","e");
 //       List<String> upperCaseLetters=new ArrayList<>();
//        for (String l:letters) {
//            upperCaseLetters.add(l.toUpperCase());
//        }
//        System.out.println(upperCaseLetters);

        List<String> newLetters=letters.stream().map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(newLetters);


    }
}

import java.util.Optional;

//orElse
public class OptionalPrg {

    public static void main(String[] args) {
        Optional<String> gender=Optional.of("Male");
        Optional<String> emptyGender=Optional.empty();

//        if(gender.isPresent()){
//            System.out.println("Data available");
//        }else{
//            System.out.println("Data not available");
//        }
//
//        emptyGender.ifPresent(a-> System.out.println("Empty"));

        System.out.println(gender.orElse("Not Available"));
        System.out.println(emptyGender.orElse("Not Available"));

    }
}

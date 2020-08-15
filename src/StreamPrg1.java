import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//findFirst(), findAny()
public class StreamPrg1 {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,10,15,20,25);

//        Optional<Integer> firstValue=list.stream().findFirst();
//        if(firstValue.isPresent()){
//            Integer data=firstValue.get();
//            System.out.println(data);
//        }else{
//            System.out.println("No value available");
//        }

//        Optional<Integer> firstVal=list.stream().filter(a->a>5).findFirst();
//        if(firstVal.isPresent()){
//            Integer data1=firstVal.get();
//            System.out.println(data1);
//        }else{
//            System.out.println("Value not present");
//        }

        Optional<Integer> someValue=list.stream().filter(a->a>5).findAny();
        Integer data2=someValue.get();
        System.out.println(data2);
    }
}

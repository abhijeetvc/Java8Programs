import java.util.StringJoiner;

public class StringJoinerPrg {

    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner(",");
        sj.add("A");
        sj.add("B");
        sj.add("C");
        String result=sj.toString();
        System.out.println(result);
    }
}

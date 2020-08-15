import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CheckPerson {

    public static void main(String[] args) {
        Person p1=new Person();
        p1.setName("A");
        p1.setAge(25);
        p1.setSalary(50000.00);

        Person p2=new Person();
        p2.setName("B");
        p2.setAge(30);
        p2.setSalary(55000.00);

        Person p3=new Person();
        p3.setName("C");
        p3.setAge(35);
        p3.setSalary(55000.00);

        List<Person> list=new ArrayList();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        List<String> names=list.stream().
                map(a->a.getName()).
                collect(Collectors.toList());
        System.out.println("Names are: "+names);


    }
}

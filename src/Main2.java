import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(
                List.of(
                        new Person("Jack",22),
                        new Person("aack",22),
                        new Person("Aack",22),
                        new Person("Georgii",20),
                        new Person("John",29),
                        new Person("lena",20),
                        new Person("Sam",18),
                        new Person("Tim",25)
                )
        );

        personList.sort( (p1,p2) -> p1.getAge() - p2.getAge()        );
        System.out.println(personList);

        personList.sort( (p1,p2) -> p1.getName().compareToIgnoreCase(p2.getName()));
        System.out.println(personList);
    }

}

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "John",
                "Jim",
                "Jonatan",
                "Jack",
                "Rick",
                "Sam"
        ));

        //List<String> result = stringListHandler(list, new ToUpperCaseTransformer());
        List<String> result = stringListHandler(list, (str) -> { return str.toUpperCase();}  );
        System.out.println(result);

        List<String> list1 = stringListHandler(list, (str) -> {  return "[" + str + "]";  });
        System.out.println(list1);


        //List<String> list2 = stringListHandler(list, (str) -> {   return str.toLowerCase(); }   );
        List<String> list2 = stringListHandler(list, str->str.toLowerCase()   );

        System.out.println(list2);


        List<String> res1 = stringListFilter(list, str -> str.length() > 3);
        System.out.println(res1);

        //List<String> res2 = stringListFilter(list, s -> s.startsWith("J"));
        List<String> res2 = stringListFilter(list, (String s) -> { return s.startsWith("J");}   );
        System.out.println(res2);


        // int compare (Object o1, Object o2 )


        list.sort(   (s1,s2)->s1.length()-s2.length()  );
        System.out.println(list);

        list.sort(   (s1,s2)-> s1.compareTo(s2) );
        System.out.println(list);


    }

    public static List<String> stringListHandler(List<String> list, StringTransformer transformer){
        List<String> result = new ArrayList<>();
        for (String str:list){
            result.add(  transformer.apply(str)   );
        }

        return result;
    }

    public static List<String> stringListFilter(List<String> list, StringPredicate predicate){
        List<String> result = new ArrayList<>();
        for (String str:list){
            if ( predicate.test(str)  ){
                result.add(str);
            }
        }


        return result;
    }





}
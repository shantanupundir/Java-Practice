import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class collectionPrac {
  public static void main(String[] args) {
    // List<Integer> list = new ArrayList<>();
    // list.add(1);
    // list.add(2);
    // list.add(3);
    // list.add(4);
    // list.add(5);
    // System.out.println(list);


    // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1);
    // System.out.println(list.contains(4));
    // System.out.println(list.stream().distinct().collect(Collectors.toList()));
    // System.out.println(list.size());
    // System.out.println(list);


    Set<Integer> set = Set.of(1, 2, 3, 4, 5);
    System.out.println(set.contains(4));

  }
}

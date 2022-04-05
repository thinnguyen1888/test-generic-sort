import java.util.ArrayList;
import java.util.List;

public class GenericSort2 {
  public static void main(String[] args) {
    GenericSort2 genericSort2 = new GenericSort2();
    List<Integer> list = new ArrayList<>();
    list.add(30);
    list.add(20);
    list.add(50);
    list.add(10);
    list.add(40);

    genericSort2.sort(list);
    System.out.println(list);
  }

  public <T extends Comparable<? super T>> List<T> sort(List<T> s) {
    s.sort((o1, o2) -> o1.compareTo(o2));
    return s;
  }

  public int square(int x) {
    return x * x;
  }
}

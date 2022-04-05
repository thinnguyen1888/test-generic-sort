import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenericSortTest2 {

  @Test
  public void square() {
    GenericSort2 genericSort2 = new GenericSort2();
    int result = genericSort2.square(5);

    assertEquals(25, result);
  }

  @Test
  public void sort() {
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(50);
    list.add(40);
    list.add(20);
    list.add(30);

    list.sort((Integer::compareTo));

    assertEquals(Arrays.asList(10, 20, 30, 40, 50), list);
  }
}
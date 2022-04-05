import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericSortTest {

  @Test
  public <E extends Comparable<E>> void sort() {
    E currentMin;
    int currentMinIndex;

    Integer[] list = {50, 20, 30, 10, 40};

    for (int i = 0; i < list.length - 1; i++) {
      currentMin = (E) list[i];
      currentMinIndex = i;

      for (int j = i + 1; j < list.length; j++) {
        if (currentMin.compareTo((E) list[j]) > 0) {
          currentMin = (E) list[j];
          currentMinIndex = j;
        }
      }
      if (currentMinIndex != i) {
        list[currentMinIndex] = list[i];
        list[i] = (Integer) currentMin;
      }
    }

    Integer[] afterSortList = {10, 20, 30, 40, 50};

    assertArrayEquals(afterSortList, list);
  }
}
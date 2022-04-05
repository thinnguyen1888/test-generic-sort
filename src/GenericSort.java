import java.util.Arrays;

public class GenericSort {

  public static void main(String[] args) {
    Integer[] list = {50, 20, 30, 10, 40};

    sort(list);
    System.out.println(Arrays.toString(list));
  }

  public static <E extends Comparable<E>> void sort(E[] list) {
    E currentMin;
    int currentMinIndex;
    for (int i = 0; i < list.length - 1; i++) {
      currentMin = list[i];
      currentMinIndex = i;

      for (int j = i + 1; j < list.length; j++) {
        if (currentMin.compareTo(list[j]) > 0) {
          currentMin = list[j];
          currentMinIndex = j;
        }
      }
      if (currentMinIndex != i) {
        list[currentMinIndex] = list[i];
        list[i] = currentMin;
      }
    }
  }
}

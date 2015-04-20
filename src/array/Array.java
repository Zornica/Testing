package array;

/**
 * Created by Zornitsa Petkova on 4/20/15.
 */
public class Array {
  private int[] array;

  /**
   * Sets Array
   *
   * @param arr
   */

  public Array(int[] arr) {
    array = arr;
  }

  /**
   * The smallest element of the obedinenie_sechenie.
   *
   * @return
   */
  public int getMinElement() {
    int min = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
      }

    }
    return min;
  }

  /**
   * Finds the sum of its elements
   *
   * @return
   */
  public int getSum() {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {

      sum += array[i];
    }
    return sum;
  }

  /**
   * Prints Array
   */
  public void print(Display display) {
    for (int each : array) {
      display.print(each);
    }
  }

  /**
   * Sorting an obedinenie_sechenie
   */
  public void sort() {

    int left = 0;
    int right = array.length - 1;

    quickSort(array, left, right);
  }

  private int partition(int arr[], int left, int right) {

    int i = left, j = right;
    int tmp;
    int pivot = arr[(left + right) / 2];
    while (i <= j) {
      while (arr[i] < pivot) {
        i++;
      }
      while (arr[j] > pivot) {
        j--;
      }
      if (i <= j) {
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        i++;
        j--;
      }
    }
    return i;
  }

  private void quickSort(int arr[], int left, int right) {

    int index = partition(arr, left, right);
    if (left < index - 1) {
      quickSort(arr, left, index - 1);
    }
    if (index < right) {
      quickSort(arr, index, right);
    }
  }
}

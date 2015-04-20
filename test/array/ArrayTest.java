package array;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Zornitsa Petkova on 4/20/15.
 */
public class ArrayTest {
  int[] array = {23, 5, 41, 12, 10, 9};
  Array arr;

  @Before
  public void setUp() {
    arr = new Array(array);
  }

  @Test
  public void GetMinElement() {
    assertThat(arr.getMinElement(), is(5));
  }

  @Test
  public void GetSum() {
    assertThat(arr.getSum(), is(100));
  }

  @Test
  public void Sort() {
  final StringBuilder buffer = new StringBuilder();
    arr.sort();
   arr.print(new Display() {
     @Override
     public void print(int value) {
       buffer.append(value).append(" ");
     }
   });
    assertThat(buffer.toString(),is("5,9,10,12,23,41"));
  }
}

package school;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Zornitsa Petkova on 4/20/15.
 */
public class SchoolTest {
  School student;

  @Before
  public void setUp() {
    student = new School();
  }

  @Test
  public void remove() {

    Student Ivan = new Student("Ivan", 18002, 22, "Informatika", 5.69);
    Student Zornica = new Student("Zornica", 18007, 23, "Informatika", 5.20);
    Student Marina = new Student("Marina", 18000, 21, "Informatika", 5.60);
    student.add(Ivan);
    student.add(Zornica);
    student.add(Marina);
    student.remove(1);
    final StringBuilder buffer = new StringBuilder();
    student.printList(new Display() {
      @Override
      public void print(Student value) {
        buffer.append(value.getName()).append(" ");
      }
    });
    assertThat(buffer.toString(), is("Ivan Marina "));
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void removeOfEmptyList() {

    student.remove(2);
  }

  @Test
  public void sort() {

    Student Ivan = new Student("Ivan", 18002, 22, "Informatika", 5.69);
    Student Zornica = new Student("Zornica", 18007, 23, "Informatika", 5.20);
    Student Marina = new Student("Marina", 18000, 21, "Informatika", 5.60);
    student.add(Ivan);
    student.add(Zornica);
    student.add(Marina);
    student.sort();
    final StringBuilder buffer = new StringBuilder();
    student.printList(new Display() {
      @Override
      public void print(Student value) {
        buffer.append(value.getNumber()).append(" ");
      }
    });

    assertThat(buffer.toString(), is("18000 18002 18007 "));
  }
}


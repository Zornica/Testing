package school;





import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Zornitsa Petkova on 4/20/15.
 */
public class School {
  List<Student> list = new ArrayList<Student>();

  public void add(Student s) {
    list.add(s);
  }

  public void remove(int position) {
    list.remove(position);
  }

  public void sort() {
    for (Student p : list) {
      Collections.sort(list, new Comparator<Student>() {
        @Override
        public int compare(Student student1, Student student2) {
          if (student1.getNumber() < student2.getNumber()) {
            return -1;
          } else {
            return 1;
          }
        }
      });
    }
  }

  public void printList(Display display) {
    for(Student each : list){
      display.print(each);
    }
  }
}

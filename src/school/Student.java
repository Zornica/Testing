package school;

/**
 * Created by Zornitsa Petkova on 4/20/15.
 */
public class Student {
  private String name;
  private int number;
  private int age;
  private String speciality;
  private double mark;

  public Student(String name, int number, int age, String speciality, double mark) {
    this.name = name;
    this.number = number;
    this.age = age;
    this.speciality = speciality;
    this.mark = mark;
  }

  public String getName() {
    return name;
  }

  public int getNumber(){
    return number;
  }
}

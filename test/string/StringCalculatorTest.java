package string;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Zornitsa Petkova on 4/20/15.
 */
public class StringCalculatorTest {
  StringCalculator calculator;

  @Before
  public void setUp() {
    calculator = new StringCalculator();
  }

  @Test
  public void sum() {

    assertThat(calculator.sum("9", "9"), is("18"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void sumNullArgument() {

    calculator.sum(null, "9");
  }

  @Test(expected = NumberFormatException.class)
  public void sumFalseArgument() {
    calculator.sum("bajk", "9");
  }
}

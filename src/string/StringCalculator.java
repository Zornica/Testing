package string;

import java.math.BigDecimal;

/**
 * Created by Zornitsa Petkova on 4/20/15.
 */
public class StringCalculator {
  public String sum(String a, String b) {
    if (a == null || b == null) {
      throw new IllegalArgumentException();
    }
    BigDecimal s = new BigDecimal(a);
    BigDecimal t = new BigDecimal(b);
    s = s.add(t);
    return s.toString();

  }
}

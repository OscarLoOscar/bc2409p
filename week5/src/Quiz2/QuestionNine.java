package Quiz2;

import java.math.BigDecimal;

public class QuestionNine {
  public static class Square {

    private BigDecimal length;

    public BigDecimal area() {
      return this.length.multiply(this.length); // OK
    }

    public void setLength(BigDecimal length) { // Double length
      this.length = length;
    }

    public static void main(String[] args) {
      Square s = new Square();
      // s.setLength(5.0); // Compile Error , 5.0 is double 
      s.setLength(BigDecimal.valueOf(5.0));
      System.out.print(s.area());
    }
  }
}

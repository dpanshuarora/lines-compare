import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LineTest {
  private Point a, b, c, d;
  private Line ab, cd;

  @Test
  public void checkWithPositivePoints() {
    a = new Point(1,0);
    b = new Point(3,0);
    c = new Point(2,2);
    d = new Point(4,4);
    ab = new Line(a, b);
    cd = new Line(c, d);
    assertEquals(false, ab.equals(cd));
  }

  @Test
  public void checkWithNegativePoints() {
    a = new Point(-2,-2);
    b = new Point(3,3);
    c = new Point(1,1);
    d = new Point(6,6);
    ab = new Line(a, b);
    cd = new Line(c, d);
    assertEquals(true, ab.equals(cd));
  }
}
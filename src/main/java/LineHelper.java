public class LineHelper {

  public static void main(String[] args) {
  	
    Point a = new Point(2,2);
    Point b = new Point(1,1);
    Line ab = new Line(a, b);

    Point c = new Point(0,0); 
    Point d = new Point(1,1);
    Line cd = new Line(c, d);

    if(ab.equals(cd)) {
      System.out.println("The two lines are equal");
    }
    else {
      System.out.println("The two lines are not equal");
    }
  }
}
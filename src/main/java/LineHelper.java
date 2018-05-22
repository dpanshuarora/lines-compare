public class LineHelper {

  public static void main(String[] args) {
  	
    Point one = new Point(2,2);
    Point two = new Point(1,1);
    Line a = new Line(one, two);

    Point three = new Point(0,0); 
    Point four = new Point(1,1);
    Line b = new Line(three, four);

    if(a.equals(b)) {
      System.out.println("The two lines are equal");
    }
    else {
      System.out.println("The two lines are not equal");
    }
  }
}
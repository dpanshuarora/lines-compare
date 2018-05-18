public class LineHelper {

  public static void main(String[] args) {
  	
    Line a = new Line(0, 0, 1, 1);
    Line b = new Line(1, 1, 2, 2);

    if(a.equalTo(b)) {
      System.out.println("The two lines are equal");
    }
    else {
      System.out.println("The two lines are not equal");
    }
  }

}
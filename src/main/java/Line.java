public class Line {
  
  private Point point1, point2;

  public Line(Point one, Point two) {
    this.point1 = one;
    this.point2 = two;
  }
  
  public boolean equals() {
    Double lengthOfLine1 = calculateLength();
    Double lengthOfLine2 = calculateLength();
    
    return lengthOfLine1.equals(lengthOfLine2);
  }

  private double squareOfDifferenceX() {
    return Math.pow(point1.getX() - point2.getX(), 2);
  }

  private double squareOfDifferenceY() {
    return Math.pow(point1.getY() - point2.getY(), 2);
  }

  private double calculateLength() {
    return Math.sqrt(squareOfDifferenceX() - squareOfDifferenceY());
  }
}
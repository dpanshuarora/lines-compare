public class Line {
  
  private Point one, two;

  public Line(Point one, Point two) {
    this.one = one;
    this.two = two;
  }
  
  public boolean equals(Line line) {
    Double lengthOfLine1 = calculateLength(this);
    Double lengthOfLine2 = calculateLength(line);
    
    return lengthOfLine1.equals(lengthOfLine2);
  }

  private double squareOfDifferenceX() {
    return Math.pow(one.getX() - two.getX(), 2);
  }

  private double squareOfDifferenceY() {
    return Math.pow(one.getY() - two.getY(), 2);
  }

  private double calculateLength(Line line) {
    return Math.sqrt(squareOfDifferenceX() - squareOfDifferenceY());
  }
}
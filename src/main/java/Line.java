class Line {
  
  int x1, y1, x2, y2;

  public Line(int x1, int y1, int x2, int y2) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }
  
  boolean equalTo(Line line) {
    double lengthOfLine1 = calculateLength(this);
    double lengthOfLine2 = calculateLength(line);

    if(lengthOfLine1 == lengthOfLine2) {
      return true;
    }
    else {
      return false;
    }
  }
   
  double calculateLength(Line line) {
    return Math.pow(line.x2 - line.x1, 2.0) - Math.pow(line.y2 - line.y1, 2.0);
  }
}
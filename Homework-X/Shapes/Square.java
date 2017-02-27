package Shapes;

public class Square extends BasicShape {

  public Double length;
  public Double xB;
  public Double yB;
  public Double xC;
  public Double yC;
  public Double xD;
  public Double yD;

  public Square() {
    super();
    this.length = 1.0;
    this.xB = xPos + length;
    this.yB = yPos;
    this.xC = xPos + length;
    this.yC = yPos - length;
    this.xD = xPos;
    this.yD = yPos - length;
  }
  
  public Square(Double xSpec, Double ySpec, Double lSpec) {
    super(xSpec, ySpec);
    this.length = lSpec;
    this.xB = xPos + length;
    this.yB = yPos;
    this.xC = xPos + length;
    this.yC = yPos - length;
    this.xD = xPos;
    this.yD = yPos - length;
  }
  
  public boolean intersectCheck(Square s2) {
    Square s1 = this;
    return (s1.xPos <= s2.xB) && (s2.xPos <= s1.xB) && (s1.yPos <= s2.yD) && (s2.yPos <= s1.yD);
  }
  
  public boolean intersectCheck(Rectangle r) {
    Square s = this;
    return (s.xPos <= r.xB) && (r.xPos <= s.xB) && (s.yPos <= r.yD) && (r.yPos <= s.yD);
  }
  
  public boolean intersectCheck(Circle c) {
    Square s = this;
  }
}

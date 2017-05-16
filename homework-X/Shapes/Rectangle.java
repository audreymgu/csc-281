package Shapes;

public class Rectangle extends BasicShape {

  public Double length;
  public Double height;
  public Double xB;
  public Double yB;
  public Double xC;
  public Double yC;
  public Double xD;
  public Double yD;
  
  public Rectangle() {
    super();
    this.length = 1.0;
    this.height = 1.0;
    this.xB = xPos + length;
    this.yB = yPos;
    this.xC = xPos + length;
    this.yC = yPos - height;
    this.xD = xPos;
    this.yD = yPos - height;
  }

  public Rectangle(Double xSpec, Double ySpec, Double lSpec, Double hSpec) {
    super(xSpec, ySpec);
    this.length = lSpec;
    this.height = hSpec;
    this.xB = xPos + length;
    this.yB = yPos;
    this.xC = xPos + length;
    this.yC = yPos - height;
    this.xD = xPos;
    this.yD = yPos - height;
  }
  
  public boolean intersectCheck(Rectangle r2) {
    Rectangle r1 = this;
    return (r1.xPos <= r2.xB) && (r2.xPos <= r1.xB) && (r1.yPos <= r2.yD) && (r2.yPos <= r1.yD);
  }
  
  public boolean intersectCheck(Square s) {
    Rectangle r = this;
    return (r.xPos <= s.xB) && (s.xPos <= r.xB) && (r.yPos <= s.yD) && (s.yPos <= r.yD);
  }
  
  public boolean intersectCheck(Circle c) {
    Rectangle r = this;
}

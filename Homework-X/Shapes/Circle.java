package Shapes;

public class Circle extends BasicShape {

  public Double radius;
  
  public Circle() {
    super();
    this.radius = 1.0;
  }
  
  public Circle(Double xSpec, Double ySpec, Double rSpec) {
    super(xSpec, ySpec);
    this.radius = rSpec;
  }
}
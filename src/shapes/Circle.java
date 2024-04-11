package shapes;

public class Circle implements Calculable {

  private final double radius;

  Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    double area = Math.round(Math.PI * (radius * radius));
    System.out.println("Area of circle with radius " + radius + " is " + area);
    return area;
  }
}

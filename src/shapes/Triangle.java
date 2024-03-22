package shapes;

public class Triangle implements Calculable {

  private final double sideLength;

  Triangle(double length) {
    this.sideLength = length;
  }

  @Override
  public double calculateArea() {
    double area = Math.round((Math.sqrt(3) / 4) * (sideLength * sideLength));
    System.out.println("Area of triangle with side length " + sideLength + " is " + area);
    return area;
  }
}

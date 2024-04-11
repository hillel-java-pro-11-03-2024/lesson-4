package shapes;

public class Square implements Calculable {

  private final double sideLength;

  Square(double length) {
    this.sideLength = length;
  }

  @Override
  public double calculateArea() {
    double area = Math.round(sideLength * sideLength);
    System.out.println("Area of square with side length " + sideLength + " is " + area);
    return area;
  }
}

package shapes;

import static java.lang.Math.round;

public class ShapeFactory {

  public static Calculable create(Class<?> shapeClass, double from, double to) {
    if (shapeClass.equals(Circle.class)) {
      return new Circle(random(from, to));
    } else if (shapeClass.equals(Triangle.class)) {
      return new Triangle(random(from, to));
    } else {
      return new Square(random(from, to));
    }
  }

  private static double random(double from, double to) {
    return round(from + Math.random() * (to - from));
  }

}

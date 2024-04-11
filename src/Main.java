import java.util.ArrayList;
import java.util.List;
import shapes.Calculable;
import shapes.Circle;
import shapes.ShapeFactory;
import shapes.Square;
import shapes.Triangle;

public class Main {

  public static void main(String[] args) {

    System.out.println("==================================");
    List<Calculable> list = new ArrayList<>();
    list.add(ShapeFactory.create(Circle.class, 10, 20));
    list.add(ShapeFactory.create(Circle.class, 5, 7));
    list.add(ShapeFactory.create(Square.class, 5, 15));
    list.add(ShapeFactory.create(Square.class, 8, 19));
    list.add(ShapeFactory.create(Triangle.class, 7, 17));
    list.add(ShapeFactory.create(Triangle.class, 9, 12));

    double totalArea = list.stream()
        .map(Calculable::calculateArea)
        .reduce(0.0, Double::sum);
    System.out.println("==================================");
    System.out.println("Total area of all shapes is: " + totalArea);
    System.out.println("==================================");
    System.out.println();

  }
}
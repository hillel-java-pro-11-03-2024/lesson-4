package obstacles;

public class ObstacleFactory {

  public static Obstacle create(int val) {
    return Math.random() <= 0.5
        ? new TreadMill(val)
        : new Wall(val);
  }

}

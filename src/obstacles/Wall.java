package obstacles;

public class Wall extends Obstacle implements Overcomable {

  private final int height;

  Wall(int height) {
    this.height = height;
  }

  @Override
  public int overcome(int jumpReserve) {
    return jumpReserve - height;
  }
}

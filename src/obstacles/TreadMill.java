package obstacles;

public class TreadMill extends Obstacle implements Overcomable {

  private final int length;

  TreadMill(int length) {
    this.length = length;
  }

  @Override
  public int overcome(int runReserve) {
    return runReserve - length;
  }
}

package players;

import obstacles.TreadMill;
import obstacles.Wall;

public class Player implements Running, Jumping {

  private String name;
  private int runReserve;
  private int jumpReserve;

  public Player(String name, int runReserve, int jumpReserve) {
    this.name = name;
    this.runReserve = runReserve;
    this.jumpReserve = jumpReserve;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean jump(Wall wall) {
    jumpReserve = wall.overcome(jumpReserve);
    System.out.print("J");
    return jumpReserve > 0;
  }

  @Override
  public boolean run(TreadMill treadMill) {
    runReserve = treadMill.overcome(runReserve);
    System.out.print("R");
    return runReserve > 0;
  }
}

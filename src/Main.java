import java.util.ArrayList;
import java.util.List;
import obstacles.Obstacle;
import obstacles.ObstacleFactory;
import obstacles.TreadMill;
import obstacles.Wall;
import players.Player;

public class Main {

  public static void main(String[] args) {

    List<Obstacle> obstacleList = generateObstacles();

    Player human = new Player("Mark", 300, 500);
    Player cat = new Player("Pushok", 200, 10);
    Player robot = new Player("Terminator", 20000, 100);
    List<Player> playersList = new ArrayList<>(List.of(human, cat, robot));

    playersList.forEach(
        player -> {
          System.out.println();
          System.out.println(player.getName() + " starting competition");
          processPlayer(player, obstacleList, 0);
        }
    );

  }

  private static void processPlayer(Player player, List<Obstacle> obstacleList, int index) {
    if (index > obstacleList.size()-1) {
      System.out.println("\n" + player.getName() + " FINISH COMPETITION!");
      return;
    }
    Obstacle obstacle = obstacleList.get(index);

    if (obstacle instanceof Wall wall) {
      if (player.jump(wall)) {
        processPlayer(player, obstacleList, index+=1);
      } else {
        System.out.println("X");
        System.out.println(player.getName() + " LOOSING COMPETITION");
      }
    }
    else if (obstacle instanceof TreadMill treadMill) {
      if (player.run(treadMill)) {
        processPlayer(player, obstacleList, index+=1);
      } else {
        System.out.println("X");
        System.out.println(player.getName() + " LOOSING COMPETITION");
      }
    }

  }

  private static List<Obstacle> generateObstacles() {
    List<Obstacle> obstacles = new ArrayList<>();
    for (int i = 1; i <= 30; i++) {
      obstacles.add(ObstacleFactory.create(random(3, 10)));
    }
    obstacles.forEach(obstacle -> {
      if (obstacle instanceof TreadMill) {
        System.out.print("_");
      } else {
        System.out.print("|");
      }
    });
    System.out.println();
    return obstacles;
  }

  private static int random(int from, int to) {
    return (int) (from + Math.random() * (to - from));
  }
}
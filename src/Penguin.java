public class Penguin implements CanSwim {
  @Override
  public void swim(int depth, int speed, String direction) {
    System.out.printf("Penguin swim at a depth %d, with speed %d in direction %s",
        depth, speed, direction);
  }
}

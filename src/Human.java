public class Human implements CanRun, CanSwim{
  @Override
  public void run(int speed, String direction) {
    System.out.printf("Human run with speed %d in direction %s", speed, direction);
  }

  @Override
  public void swim(int depth, int speed, String direction) {
    System.out.printf("Human swim at a depth %d, with speed %d in direction %s",
        depth, speed, direction);
  }
}

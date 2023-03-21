public class Superman implements CanFly, CanRun, CanSwim{

  @Override
  public void fly(int altitude, int speed, String direction) {
    System.out.printf("Superman flies at altitude %d, with speed %d in direction %s",
        altitude, speed, direction);
  }

  @Override
  public void run(int speed, String direction) {
    System.out.printf("Superman run with speed %d in direction %s", speed, direction);
  }

  @Override
  public void swim(int depth, int speed, String direction) {
    System.out.printf("Superman swim at a depth %d, with speed %d in direction %s",
        depth, speed, direction);
  }
}

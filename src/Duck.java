public class Duck implements CanSwim, CanFly {

  @Override
  public void fly(int altitude, int speed, String direction) {
    System.out.printf("Duck flies at altitude %d, with speed %d in direction %s",
        altitude, speed, direction);
  }

  @Override
  public void swim(int depth, int speed, String direction) {
    System.out.printf("Duck swim at a depth %d, with speed %d in direction %s",
        depth, speed, direction);
  }
}

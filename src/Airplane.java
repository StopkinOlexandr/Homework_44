public class Airplane implements CanFly{
  @Override
  public void fly(int altitude, int speed, String direction) {
    System.out.printf("Airplane flies at altitude %d, with speed %d in direction %s",
        altitude, speed, direction);
  }
}

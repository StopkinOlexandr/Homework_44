//Задача 1
// Напишите, интерфейсы "Умеет летать" CanFly с методом fly(),
// "Умеет бегать" CanRun с методом run и "умеет плавать" CanSwim с методом swim
// и реализуйте их в классе "Супермен" Superman.
public interface CanFly {
  void fly(int altitude, int speed, String direction);
}

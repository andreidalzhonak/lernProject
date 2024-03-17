package lesson5.a;

import lesson5.a.Animal;

public class Dog extends Animal {

  private String name;
  private static int countDog = 0;

  public Dog(String name) {
    super();
    countDog++;
    this.name = name;
  }

  @Override
  public void run(int range) {
    if (range > 500) {
      System.out.println(name + " не может пробежать больше 500 м");
    } else {
      System.out.println(name + " может пробежать " + range + " м");
    }
  }

  @Override
  public void swim(int range) {
    if (range > 10) {
      System.out.println("Собака не может проплыть больше " + range + " м");
    } else {
      System.out.println(name + " может проплыть " + range + " м");
    }
  }

  public static int getCountDog() {
    return countDog;
  }
}

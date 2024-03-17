package lesson5.a;

import lesson5.a.Animal;

public class Cat extends Animal {

  private String name;
  private boolean isHungry;
  private static int countCat = 0;

  public Cat(String name) {
    super();
    countCat++;
    this.name = name;
    this.isHungry = true;
  }

  public void eat() {
    if (isHungry) {
      System.out.println(name + " поел");
      isHungry = false;
    } else {
      System.out.println(name + " не голоден");
    }
  }

  public void setHungry() {
    isHungry = true;
  }

  public boolean isHungry() {
    return isHungry;
  }

  public String getName() {
    return name;
  }

  @Override
  public void run(int range) {
    if (range > 200) {
      System.out.println(name + " не может пробежать больше 200 м");
    } else {
      System.out.println(name + " может пробежать " + range + " м");
    }
  }

  @Override
  public void swim(int range) {
    System.out.println(name + " не умеет плавать");
  }

  public static int getCountCat() {
    return countCat;
  }
}
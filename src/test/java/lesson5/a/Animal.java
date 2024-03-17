package lesson5.a;

public class Animal {

  public static int countAnimal = 0;

  Animal() {
    countAnimal++;
  }

  public void run(int range) {
    System.out.println("Животное может пробежать " + range + "м");
  }

  public void swim(int range) {
    System.out.println("Животное может проплыть " + range + "м");
  }

  public static int getCountAnimal() {
    return countAnimal;
  }
}



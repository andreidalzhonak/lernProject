package lesson5.a;

public class Main {

  public static void main(String[] args) {

    Cat[] cats = new Cat[3];
    cats[0] = new Cat("Барсик");
    cats[1] = new Cat("Мурзик");
    cats[2] = new Cat("Рыжик");
    Plate plate = new Plate(5);

    Cat catMurzik = new Cat("Мурзик");
    Cat catBarsik = new Cat("Барсик");
    Dog dogSharic = new Dog("Шарик");
    Dog dogReks = new Dog("Рэкс");
    catMurzik.run(202);
    catMurzik.swim(2);
    catBarsik.run(100);
    catBarsik.swim(5);
    dogSharic.run(505);
    dogSharic.swim(12);
    dogReks.run(450);
    dogReks.swim(5);
    System.out.println("Общее количество животных: " + Animal.getCountAnimal());
    System.out.println("Общее количество котов: " + Cat.getCountCat());
    System.out.println("Общее количество собак: " + Dog.getCountDog());
    System.out.println();

    for (Cat cat : cats) {
      cat.setHungry();
      cat.eat();
      plate.addFood(2);
      plate.decreaseFood(5);
      System.out.println("Количество еды в миске: " + plate.getFood());
      System.out.println("Кот " + cat.getName() + " голоден: " + cat.isHungry());
      System.out.println();

    }
  }
}

/*
Получается что-то не так, так как по идее у Мурзика в isHungry должно быть true, так как он не поел
Мурзик поел
В миску добавлено 2 еды
В миске недостаточно еды
Количество еды в миске: 4
Кот Мурзик голоден: false*/

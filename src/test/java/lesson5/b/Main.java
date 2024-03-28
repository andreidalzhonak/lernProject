package lesson5.b;

public class Main {

  public static void main(String[] args) {
    Circle circle = new Circle(5);
    circle.setFillColor("Red");
    circle.setBorderColor("Blue");
    circle.printCharacteristics();

    Rectangle rectangle = new Rectangle(5, 6);
    rectangle.setFillColor("Green");
    rectangle.setBorderColor("Yellow");
    rectangle.printCharacteristics();

    Triangle triangle = new Triangle(3, 7, 6);
    rectangle.setFillColor("Orange");
    rectangle.setBorderColor("Black");
    triangle.printCharacteristics();
  }
}

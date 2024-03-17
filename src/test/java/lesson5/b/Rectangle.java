package lesson5.b;

public class Rectangle implements Figure, Filling, Borderable {

  private static final String NAME = "Прямоугольник";

  private double width;
  private double height;
  private String fillColor;
  private String borderColor;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public double getArea() {
    return width * height;
  }

  @Override
  public double getPerimetr() {
    return 2 * width + 2 * height;
  }

  @Override
  public void setFillColor(String color) {
    this.fillColor = color;
  }

  @Override
  public void setBorderColor(String color) {
    this.borderColor = color;
  }

  public void printCharacteristics() {
    System.out.println(NAME);
    System.out.println("Периметр: " + getPerimetr() + " м");
    System.out.println("Площадь: " + getArea() + " м2");
    System.out.println("Цвет фона: " + fillColor);
    System.out.println("Цвет границ: " + borderColor);
    System.out.println();
  }
}

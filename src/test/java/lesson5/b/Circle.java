package lesson5.b;

public class Circle implements Figure, Filling, Borderable {

  private static final String NAME = "Круг";

  private double radius;
  private String fillColor;
  private String borderColor;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    double area = Math.PI * radius * radius;
    return area;
  }

  @Override
  public double getPerimetr() {
    double perimetr = 2 * Math.PI * radius;
    return perimetr;
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

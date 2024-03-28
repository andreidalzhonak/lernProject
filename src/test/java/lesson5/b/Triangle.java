package lesson5.b;

public class Triangle implements Figure, Filling, Borderable {

  private static final String NAME = "Треугольник";

  private double sideA;
  private double sideB;
  private double sideC;
  private String fillColor;
  private String borderColor;

  public Triangle(double sideA, double sideB, double sideC) {
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  @Override
  public double getArea() {
    double perimetr = (sideA + sideB + sideC) / 2; // полупериметр триугольника
    double area = Math.sqrt(
        perimetr * (perimetr - sideA) * (perimetr - sideB) * (perimetr - sideC)); // формула Герона
    return area;
  }

  @Override
  public double getPerimetr() {
    double perimetr = (sideA + sideB + sideC);
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

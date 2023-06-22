package ru.olgaaksi.jvc.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {

    hello("Olga");
    Square s = new Square(6);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(12, 19);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
  }
  public static void hello (String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }
}

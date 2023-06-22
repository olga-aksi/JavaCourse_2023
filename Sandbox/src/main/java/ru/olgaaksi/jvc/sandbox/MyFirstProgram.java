package ru.olgaaksi.jvc.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {

    Point p1 = new Point(25, 15);
    Point p2 = new Point(16, 78);
    System.out.println("Расстояние между точками А и В равно " + distance(p1, p2));

    hello("world");
    hello("Olga");
    hello("user");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
  }
  public static double distance(Point p1, Point p2) {
    return Math.sqrt((p1.lat - p2.lat) * (p1.lat - p2.lat) + (p1.lon - p2.lon) * (p1.lon - p2.lon));
  }
  public static void hello(String somebody) {

    System.out.println("Hello, " + somebody + "!");
  }
}

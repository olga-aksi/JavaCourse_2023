package ru.olgaaksi.jvc.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {

    Point p1 = new Point(25, 15);
    Point p2 = new Point(16, 78);
    System.out.println("Расстояние между точками А и В равно " + p1.distance(p2));
  }
 }

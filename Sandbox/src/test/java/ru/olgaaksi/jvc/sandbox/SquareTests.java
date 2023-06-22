package ru.olgaaksi.jvc.sandbox;

public class SquareTests {
  @Test
  public void testArea() {
    Square s = new Square(8);
    assert s.area() == 64;
  }
}

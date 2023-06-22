package ru.olgaaksi.jvc.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {
  @Test
  public void testArea() {
    Square s = new Square(8);
    Assert.assertEquals(s.area(), 64.0);
  }
}

package ru.olgaaksi.jvc.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTests {
  @Test
  public void testDistance() {
    Point p1 = new Point(25, 28);
    Point p2 = new Point(64, 14);
    Assert.assertEquals(p1.distance(p2), 41.43669871020132);
  }

  @Test
  public void testDistanceSamePoint() {
    Point p1 = new Point(8, 8);
    Assert.assertEquals(p1.distance(p1), 0.0);
  }

  @Test
  public void testDistanceFromZeroPoint() {
    Point p1 = new Point(8, 15);
    Point p2 = new Point(0, 0);
    Assert.assertEquals(p1.distance(p2), 17.0);
  }
}

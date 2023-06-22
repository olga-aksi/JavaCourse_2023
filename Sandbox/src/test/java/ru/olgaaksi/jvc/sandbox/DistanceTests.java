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
}

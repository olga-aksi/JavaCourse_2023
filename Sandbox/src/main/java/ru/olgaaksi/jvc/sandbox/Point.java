package ru.olgaaksi.jvc.sandbox;

public class Point {
  public double lat;
  public double lon;

  public Point(double lat, double lon) {
    this.lat = lat;
    this.lon = lon;
  }
  public double distance(Point p) {
     return Math.sqrt((this.lat - p.lat) * (this.lat - p.lat) + (this.lon - p.lon) * (this.lon - p.lon));
    }
}


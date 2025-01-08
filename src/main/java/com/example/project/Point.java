package com.example.project;

public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
    public int getX() {
      return x;
    }
    public int getY() {
      return y;
    }
    
    // Returns distance between this Point object and another Point object
    public double distanceTo(Point other) {
      /* IMPLEMENT ME */
      double xVal = Math.pow((x - other.x), 2);
      double yVal = Math.pow((y - other.y), 2);
      double distance = Math.sqrt(xVal + yVal);
      return distance;
    }
  
    // Returns a string in the format: (x, y)
    public String pointInfo() {
      /* IMPLEMENT ME */
      return "("+x+", " + y + ")";
    }
    public void incrementPoint(int val) {
      x+= val;
      y+= val;
    }
  }
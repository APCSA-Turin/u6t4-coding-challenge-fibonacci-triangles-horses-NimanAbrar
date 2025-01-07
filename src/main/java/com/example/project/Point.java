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
      return Math.pow(Math.pow(x - other.getX(), 2) + Math.pow(y - other.getY(), 2), 1/2);
    }
  
    // Returns a string in the format: (x, y)
    public String pointInfo() {
      /* IMPLEMENT ME */
      return "("+x+", " + y + ")";
    }
  }
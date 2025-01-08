package com.example.project;

public class Triangle {
    // array of Point objects
    private Point[] vertices;
    private Point p1;
    private Point p2;
    private Point p3;
    
    // Constructor: initializes the vertices array
    // to contain the three Point objects
    public Triangle(Point p1, Point p2, Point p3) {
      /* IMPLEMENT ME */
      vertices = new Point[3];
      vertices[0] = p1;
      vertices[1] = p2;
      vertices[2] = p3;
      this.p1 = p1;
      this.p2 = p2;
      this.p3 = p3;
    }
    public Point[] getVertices() {
      return vertices;
    }
    
    // Returns the perimeter of the Triangle
    // HINT: use the distanceTo method that you wrote in the Point class
    public double perimeter() {
      /* IMPLEMENT ME */
      return vertices[0].distanceTo(vertices[1]) + vertices[1].distanceTo(vertices[2]) + vertices[2].distanceTo(vertices[0]);
    }
  
    // Returns a String with the three vertices that make up the Triangle;
    // if the vertices are the points (6, 10), (11, 15), and (18, 7),
    // this method should return: "[(6, 10), (11, 15), (18, 7)]"
    public String triangleInfo() {
      /* IMPLEMENT ME */
      String points = "[" + vertices[0].pointInfo() + ", " + vertices[1].pointInfo() + ", " + vertices[2].pointInfo() + "]";
      return points;
    }
    public void incrementVertices(int val) {
      p1.incrementPoint(val);
      p2.incrementPoint(val);
      p3.incrementPoint(val);
    }
  }
  
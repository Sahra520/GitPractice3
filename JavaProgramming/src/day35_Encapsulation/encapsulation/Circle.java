package day35_Encapsulation.encapsulation;

public class Circle {

    public double radius;
    private static double pi;

    public double area;
    public double perimeter;

    public Circle(double radius, double pi, double area, double perimeter) {
        setRadius(radius);
        setPi(pi);
        setArea(area);
        setPerimeter(perimeter);
    }

    public Circle(double radius, double pi) {
        setRadius(radius);
        setPi(pi);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            return;
        }
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = 3.14;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void calcArea(double area) {
        area= radius * radius * pi;
    }

    public void calcPerimeter() {
        double perimeter = 2 * radius * pi;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                "area=" + area +
                "perimeter=" + perimeter +
                '}';
    }

   /*
    Create a class named Circle
       private variables:
          radius
       public variable:
          pi
    Encapsulate all the private fields
      1. Radius of the circle can not be zero or negative

     Add a constructor that can set the radius of circle when circle object is created
            Methods:
               calcArea();
               calcPerimeter();
               toString();
     */
}

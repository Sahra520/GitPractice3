package day38_Inheritance_MethodOverriding.shape;

public class Circle extends Shape {

    public double radius;
    public double pi;

    public Circle(String name, double radius, double pi) {
        super(name);
        this.radius = radius;
        this.pi = pi;
    }

    public void area(){
        System.out.println(radius * radius * pi);
    }

    public void perimeter(){
        System.out.println(2 * radius * pi);
    }


    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", pi=" + pi +
                '}';
    }
}
/*
 Circle subclass:
   radius
   pi
   toString(): name, radius, pi, area, perimeter
 */
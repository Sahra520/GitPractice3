package day38_Inheritance_MethodOverriding.shape;

public class Shape {

    public String name;

    public Shape(String name) {
        this.name = name;

    }

    public void area(){
        return;
    }

    public void perimeter(){
        return;
    }

    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}

/*
Shape:
 variable:
   name
Add a constructor to set the field

Methods:
   area(){return 0}
   perimeter(){return 0}
   toString(): name, area, perimeter

   Circle subclass:
   radius
   pi
   toString(): name, radius, pi, area, perimeter

   Square subclass:
   side
   toString(): name, side, area, perimeter

   Rectangle subclass:
   length
   width
   toString(): name, length, width, area, perimeter
 */

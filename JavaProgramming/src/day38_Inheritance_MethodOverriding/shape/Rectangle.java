package day38_Inheritance_MethodOverriding.shape;

public class Rectangle extends Shape {

    public int length;
    public int width;


    public Rectangle(String name, int length, int width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public void area(){
        System.out.println(width * length);
    }

    public void perimeter(){
        System.out.println(2 * (width + length) );
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                " name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
/*
Rectangle subclass:
   length
   width
   toString(): name, length, width, area, perimeter
 */
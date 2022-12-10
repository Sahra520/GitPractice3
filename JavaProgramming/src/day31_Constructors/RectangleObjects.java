package day31_Constructors;

public class RectangleObjects {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5.5,3.5);

        Rectangle rectangle2 = new Rectangle(12,15);

        Rectangle rectangle3 = new Rectangle(8,4);

        System.out.println(rectangle1);//Rectangle{length=5.5, width=3.5, area=19.25, perimeter=18.0}
        System.out.println(rectangle2);//Rectangle{length=12.0, width=15.0, area=180.0, perimeter=54.0}
        System.out.println(rectangle3);//Rectangle{length=8.0, width=4.0, area=32.0, perimeter=24.0}
    }
}

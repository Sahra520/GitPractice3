package day30_CustomClassIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("BMW","X5", "White",2023,12000.50);

        car1.toString();

        car1.drive();
        car1.start();
        car1.stop();
        System.out.println(car1);

        System.out.println("------------");

        Car car2 = new Car();
        car2.setInfo("Toyota","Camry","White",2021,35000);

        car2.start();  car2.drive(); car2.stop();

        System.out.println(car2);

        System.out.println("-----------------");

        Car car3 = new Car();
        car3.setInfo("BMW","335is","Black",2020,45000);
        car3.start();car3.drive();car3.stop();
        car3.toString();

        System.out.println(car3);

        //Car[] cars = {car1,car2,car3};
        //collection into the array we don't agree because lots of disadvantages,
        //like we cannot change any info from any car array


        //but Arraylist is good to collect
        ArrayList<Car>carList = new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2,car3));

        for (Car each:carList) {
            System.out.println(each.brand + ":" +each.price);
        }

        System.out.println("----------------------");

        /*recall car years:
        BMW: 2005~2008.
        Toyota: 1995~1997
        if we have cars like this models we have to remove, so we use removeIf();
         */

        carList.removeIf(p -> p.brand.equals("BMW") && p.year >= 2005 && p.year <= 2008);
        carList.removeIf(p -> p.brand.equals("Toyota") && p.year >= 1995 && p.year <= 1997);




    }
}

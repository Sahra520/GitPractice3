package day32_Constructor;

public class CarpetObjects {

    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(2.5,4,20,true);
        System.out.println(carpet1);//Carpet{width=2.5, length=4.0, unitPrice= $20.0,
        // isPersian= true, total price = $400.0}

        Carpet carpet2 = new Carpet(3,5,40,true);
        System.out.println(carpet2);//Carpet{width=3.0, length=5.0, unitPrice= $40.0,
        // isPersian= true, total price = $800.0}

        Carpet carpet3 = new Carpet(10,20,8,false);
        System.out.println(carpet3);//Carpet{width=10.0, length=20.0, unitPrice= $8.0,
        // isPersian= false, total price = $1600.0}

    }
}

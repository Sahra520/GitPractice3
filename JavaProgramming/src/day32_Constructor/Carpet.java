package day32_Constructor;

public class Carpet {

    public  double width,//with public access modifier we can access those variables
    length,unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        //constructor name must be same name with the class name
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double totalPrice = (width * length) * unitPrice;
        if (isPersian){
            totalPrice+=200;
        }
        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian= " + isPersian +
                ", total price = $" + calcCost() +
                '}';
    }

    /*
    Carpet task:
    1.1 create a custom class for the Carpet class that should contain the following:
    Attributes:
           width, length, unitPrice, isPersian(boolean)
    Add a constructor to set all the instances
       Actions;
    calcCost(): should to be able to calculate the total cost of the carpet and return it as double
    toString(): should be able to display all the info of the carpet including
    the total cost of the carpet as calculated by calcCost()

    total price of carpet= (width * length) * unitPrice
    if the carpet is Persian carpet, add 200$ to the totalPrice
     */
}

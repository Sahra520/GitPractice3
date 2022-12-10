package day21_ForEachLoop;

public class Items {

    public static void main(String[] args) {

        //it can be interview question, I think
        //expecting output:ItemName-ItemID-Price
        String[] items={"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        //                 1         2         3          4        5           6
        double[] prices ={99.99,    150.0,    9.99,      250.0,  439.50,     39.99};
        //                 1         2         3          4        5           6
        int[] itemsIDs = {12345,     12346,   12347,     12348,   12349,     12350};
        //                 1         2         3          4        5           6

        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            double price = prices[i];
            int id = itemsIDs[i];
            System.out.println(item+"-"+id+"-$"+price);

            /*
            Shoes-12345-$99.99
Jacket-12346-$150.0
Gloves-12347-$9.99
AirPods-12348-$250.0
iPad-12349-$439.5
iPhone 12 case-12350-$39.99

             */
        }

    }
}

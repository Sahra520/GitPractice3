package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
       Offer offer1 = new Offer();
       offer1.setInfo("VA","Amazon","SDET",110000,
               true,true,true,true);
        System.out.println(offer1);

       Offer offer2 = new Offer();
       offer2.setInfo("CA","SonyInc","QA",120000,
               true,false,false,true);
        System.out.println(offer2);

        Offer offer3 = new Offer();
        offer3.setInfo("FL","Apple Inc","QE",125000,
                true,true,true,false);
        System.out.println(offer3);

        Offer offer4 = new Offer();
        offer4.setInfo("Tx","CapitalOne","SM",115000,
                false,false,true,true);
        System.out.println(offer4);

        Offer offer5 = new Offer();
        offer5.setInfo("WA","Bank Of America","BA",130000,
                true,true,false,true);
        System.out.println(offer5);


        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5};
        ArrayList<Offer> fullTimeOffers= new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p->!p.isFullTime);//removes if the offer is NOT full time
        System.out.println(fullTimeOffers.size());//4

        ArrayList<Offer> localOffers= new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p->!(p.location.equals("VA") || p.location.equals("CA")));
        //removes the offer if the offer is not from local area
        System.out.println(localOffers.size());//2


        for (Offer localOffer : localOffers) {
            System.out.println(localOffer.companyName+":"+localOffer.salary);
        }




    }


    /*
    create a class named MyOffers:
    1. create 7 objects to offer
    2. create an array of offers named MyOffers and store all 7 objects of offers
    3. create an ArrayList of Offer named fullYTimeOffers and add all the offer objects
      3.1. write a program that can remove the offer objects that are not full-time
    4. create an ArrayList of offer named localOffers and add all the offer objects.
      4.1. write a program that can remove all the offers that are not from local
    5. create an ArrayList of Offer named offersWithBenefits and add all the offer objects
      5.1. write a program that can remove all the offers that does not have benefit and does not have PTO
    6. create an ArrayList of Offer named sdetOffers and add all the offer objects.
      6.1. write a program that can remove all the offers that are not for SDET.
    7. create an ArrayList of Offer named offersWith100K and add all the offer objects
      7.1. write a program that can remove all the offers that are offering less than 100K salary
     */
}

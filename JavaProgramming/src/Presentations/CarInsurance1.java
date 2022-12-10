package Presentations;

import java.util.Scanner;

import static java.lang.System.in;

public class CarInsurance1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(in);

        double premiumCost=0;
        System.out.println("Enter your full name");
        String name= scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String license = scan.nextLine();
        if(license.equalsIgnoreCase("no")){
            System.out.println("You must have a license to get insurance!");
            System.exit(0);
        }else{
            System.out.println("Enter your zip code");
            int zip=scan.nextInt();
            if(zip==20910||zip==20740){
                premiumCost+=60;
            }else if(zip==22102||zip==22103){
                premiumCost+=30;
            }else{
                premiumCost+=50;
            }
            scan.nextLine();
            System.out.println("Is this vehicle owned, financed, or leased?");//leased == kiado
            String vehicle= scan.nextLine();//vehicle-arac
            if(vehicle.equalsIgnoreCase("owned")){
                premiumCost+=10;
            }else if(vehicle.equalsIgnoreCase("financed")){
                premiumCost+=15;
            }else{
                premiumCost+=20;
            }
            System.out.println("How is this vehicle primarily used?");
            String vehicleUsage=scan.nextLine();
            if(vehicleUsage.equalsIgnoreCase("business")){
                premiumCost+=50;
            }else if(vehicleUsage.equalsIgnoreCase("pleasure")){
                premiumCost+=10;
            }else if(vehicleUsage.equalsIgnoreCase("commuting")){//just used go and come back to work
                premiumCost+=20;
                System.out.println("How many days do you commute?");
                int commute=scan.nextInt();
                premiumCost+=commute*5;

            }
            System.out.println("How old are you?");
            int age=scan.nextInt();
            if(age<16){
                System.out.println("You can't be driving");
                System.exit(0);
            }else if(age>=16&&age<20){
                premiumCost*=10;
            }else if(age>=20&&age<25){
                premiumCost*=6;
            }else if(age>=25){
                premiumCost*=2;
            }
            scan.nextLine();
            System.out.println("Have you had any accidents in the last 5 years?");
            String accidents=scan.nextLine();
            if(accidents.equalsIgnoreCase("yes")){
                System.out.println("How many?");
                int accidentNum=scan.nextInt();
                premiumCost+=10*accidentNum;
            }
            scan.nextLine();
            System.out.println("What is the highest level of education you have completed?");
            String education=scan.nextLine();
            if(education.equalsIgnoreCase("bachelors")||education.equalsIgnoreCase("Masters")){
                premiumCost-=premiumCost*0.05;
            }else if(education.equalsIgnoreCase("PHD")){
                premiumCost-=premiumCost*0.10;
            }else if(education.equalsIgnoreCase("High School")){
                education=education.replace(" ","");
                premiumCost-=premiumCost*0.05;
            }
            String nameFirst= name.substring(0, name.indexOf(" "));
            nameFirst=nameFirst.toUpperCase().charAt(0)+nameFirst.substring(1);


            String lastName=name.substring(name.indexOf(" ")+1);
            lastName=lastName.toUpperCase().charAt(0)+lastName.substring(1);
            String fullName=nameFirst+" "+lastName;


            String reference=nameFirst.substring(0, 2).toUpperCase()+age+
                    lastName.substring(lastName.length()-3).toUpperCase()+zip+education.toUpperCase();


            System.out.println(fullName+", here's your quote!");
            System.out.println("This is your start premium cost: $"+premiumCost);
            System.out.println("This is your reference number: "+reference);
        }
    }
}

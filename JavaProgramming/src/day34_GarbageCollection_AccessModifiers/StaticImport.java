package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.pi;

public class StaticImport {

    public static void main(String[] args) {

        System.out.println(pi);

        System.out.println(pi);//here I wrote Circle.pi.sout-but ID gave me just pi because pi value already assigned
        System.out.println(Circle.name);


        //normally we have to print Circle.pi but in import we called Circle

    }






}

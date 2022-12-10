package day36_InheritanceIntro.planet;

public class Earth extends Planet{
    public Earth(String name, String mass, double radius, String surfaceGravity,
                 double surfaceArea, String volume, long population) {
        super(name, mass, radius, surfaceGravity, surfaceArea, volume, population);
    }
}

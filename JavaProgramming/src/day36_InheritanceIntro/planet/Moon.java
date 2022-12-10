package day36_InheritanceIntro.planet;

public class Moon extends Planet{
    public Moon(String name, String mass, double radius, String surfaceGravity, double surfaceArea,
                String volume, long population) {
        super(name, mass, radius, surfaceGravity, surfaceArea, volume, population);
    }
}

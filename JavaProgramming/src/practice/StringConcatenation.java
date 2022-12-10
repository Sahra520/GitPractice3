package practice;

public class StringConcatenation {
    public static void main(String[] args) {
        String man="Adam";
        System.out.println(man+12+13); //Adam1213
        System.out.println(17+13+man); //30Adam
        System.out.println(14+16+man+28+5); //30Adam285

        String c ="5";
        System.out.println(c +12+13); //5_1213
        System.out.println(17+13+ c); //30_5
        System.out.println(14+16+ c +28+5); //30_5_285


    }
}

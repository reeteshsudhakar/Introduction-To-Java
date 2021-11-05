package unit9_methods;

public class passing_and_returning_data {
    public static void main(String[] args) {
        System.out.println(coneVolume(4, 5));
    }

    public static double coneVolume (double r, double h){
        return Math.PI * r * r * (h/3);
    }
}

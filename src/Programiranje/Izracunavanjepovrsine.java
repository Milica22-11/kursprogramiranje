package Programiranje;

public class Izracunavanjepovrsine {
    public static void main(String[] args) {
        System.out.println(area(5,6.5));
    }
    public static double area(int n, double side) {
        double area = 0;
        area=(n*side*side)/(4*Math.tan((Math.PI/n)));
        return area;


    }
}

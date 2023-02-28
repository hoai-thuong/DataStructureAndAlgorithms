package Hw1.exercise4;

//Volume= (4/3)*pie*r3
public class Sphere {
    double r;
    double x;
    double y;
    double z;

    public Sphere(double r, double x, double y, double z) {
        this.r = r;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static double distanceOfTwoCenter(Sphere s1, Sphere s2) {
        return Math.sqrt((s1.x - s2.x) * (s1.x - s2.x) + (s1.y - s2.y) * (s1.y - s2.y) + (s1.z - s2.z) * (s1.z - s2.z));
    }

    public double sphereVolume(double radius) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    } // end method sphereVolume

    public double sphereSurfaceArea(double radius) {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public static void sphereIntersect(Sphere s1, Sphere s2) {
        double sumOfRadius = s1.r + s2.r;
        if (sumOfRadius >= distanceOfTwoCenter(s1, s2)) {
            System.out.println("\nTwo sphere intersect");
        } else {
            System.out.println("\nTwo sphere are not intersect");
        }
    }

    public static void sphereFully(Sphere s1, Sphere s2) {
        double differenceOfRadius = Math.abs(s1.r - s2.r);
        if (differenceOfRadius >= distanceOfTwoCenter(s1, s2)) {
            System.out.println("\nA sphere is fully inside another sphere");
        } else {
            System.out.println("\nA sphere is not fully inside another sphere");
        }
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "r = " + r +
                ", I = (" + x +
                ", " + y +
                ", " + z +
                ") }";
    }

    public static void main(String[] args) {
        Sphere s1 = new Sphere(Math.sqrt(10), -1, 1, 1);
        Sphere s2 = new Sphere(1, -1, -1, -2);
        System.out.println("\nSphere 1: " + s1);
        System.out.println("\nSphere 2: " + s2);
        System.out.println("\nVolume of s1: ");
        System.out.println(s1.sphereVolume(s1.r));
        System.out.println("\nVolume of s2: ");
        System.out.println(s2.sphereVolume(s2.r));
        System.out.println("\nSurface Area of s1: ");
        System.out.println(s1.sphereSurfaceArea(s1.r));
        sphereIntersect(s1, s2);
        sphereFully(s1, s2);
    }
}
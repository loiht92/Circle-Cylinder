public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        System.out.println("Rectangular area is:" +circle.getArea());

        circle = new Circle(1, "red");
        System.out.println(circle);
        System.out.println("Rectangular area is:" +circle.getArea());

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println("Cylindrical volume is:" +cylinder.getVolume());

        cylinder = new Cylinder(3, 2, "red");
        System.out.println(cylinder);
        System.out.println("Cylindrical volume is:" +cylinder.getVolume());

        cylinder = new Cylinder(3,4,"white");
        System.out.println(cylinder);
        System.out.println("Cylindrical volume is:" +cylinder.getVolume());
    }
}

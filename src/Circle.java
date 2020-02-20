public class Circle {
    public static final double PI = 3.14;
    private double radius;
    private String color = "yellow";

    public Circle(){ //ham khoi tao

    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius ;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + "\t" +
                ", color='" + color + '\'' +
                '}';
    }
}

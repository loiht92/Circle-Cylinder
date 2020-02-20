public class Cylinder extends Circle{
   private double height;

   public Cylinder(){

   }
   public Cylinder(double height, double radius, String color) {
       super(radius, color);
       this.height = height;
   }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
       //return height * getArea();
        return height * getRadius() * getRadius() * PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + getRadius() +"\t" +
                "color= " +getColor() + "\t" +
                "height=" +height +
                '}';
    }
}

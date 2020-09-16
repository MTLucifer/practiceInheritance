package Circle;

public class Cylinder  extends Circle{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double radius, String color) {
        super(radius, color);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (super.getPerimeter() * height) + 2 * super.getArea();
    }

    public double getVol() {
        return Math.PI * Math.pow(getRadius(), 2) * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + getRadius() +
                ", color= " + getColor() +
                ", area= " +getArea()+
                ", volume= "+getVol()+"}";
    }
}

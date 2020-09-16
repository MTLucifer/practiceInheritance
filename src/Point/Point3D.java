package Point;

import java.util.Arrays;

public class Point3D extends Point2D{
    private float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y,float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] array = new float[3];
        array[0]=super.getX();
        array[1]=super.getY();
        array[2]=z;
        return array;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                Arrays.toString(getXYZ()) +
                '}';
    }
}

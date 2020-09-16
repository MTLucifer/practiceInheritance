package MovablePoint;

import java.util.Arrays;

public class MovablePoint extends Point {
    float xSpeed, ySpeed;

    public MovablePoint() {
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed =xSpeed;
        this.ySpeed =ySpeed;
    }

    public float[] getSpeed(){
        float[] array = new float[2];
        array[0]=xSpeed;
        array[1]=ySpeed;
        return array;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                Arrays.toString(super.getXY())+", " +
                Arrays.toString(getSpeed()) +
                '}';
    }

    MovablePoint move(){
        float a=super.getX(),b= super.getY();
        a += xSpeed;
        b += ySpeed;
        super.setX(a);
        super.setY(b);
        return this;
    }
}

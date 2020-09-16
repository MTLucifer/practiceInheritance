package MovablePoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(5.6f,7.8f);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(4.3f,5.3f,7.9f,7.9f);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}

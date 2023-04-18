package Inheritance.movePoint;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public MovablePoint() {

    }
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
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
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float[] arr = {xSpeed, ySpeed};
        return arr;
    }
    public MovablePoint move() {
        float x = getX();
        float y = getY();
        x += xSpeed;
        y += ySpeed;
        setXY(x, y);
        return this;
    }
    @Override
    public String toString() {
        return "MovablePoint{" + super.toString()+
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}'+ " --> " + Arrays.toString(getSpeed());
    }
}

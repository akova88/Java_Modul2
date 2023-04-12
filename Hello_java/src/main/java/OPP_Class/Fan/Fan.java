package OPP_Class.Fan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
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
    public String toStringFan() {
        if(this.isOn()) {
            return "Tốc độ: " + getSpeed() + " Màu sắc: " + getColor() + " Bán kính: " + getRadius() + " Quạt đang bật";
        } else
            return "Màu sắc: " + getColor() + " Bán kính: " + getRadius() + " Quạt đang tắt";
    }
}

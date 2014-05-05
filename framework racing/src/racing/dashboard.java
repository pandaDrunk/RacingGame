package racing;

public class dashboard {
	private int speed;
	private int rotation;
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getRotation() {
        return rotation;
    }
    public void setRotation(int speed) {
        this.rotation = speed;
    }
    public void print_speed() {
        System.out.println("get speed: " + this.getSpeed());
    }
    public void print_rotation() {
        System.out.println("get rotating speed: " + this.getRotation());
    }
}

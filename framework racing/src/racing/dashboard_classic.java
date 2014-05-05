package racing;

public class dashboard_classic extends dashboard{
	
    public void print_speed() {
        super.print_speed();
        System.out.println("The speed " + this.getSpeed() + " showed in classical mode.");
    }
	public void print_rotation() {
        super.print_rotation();
        System.out.println("The rotating speed " + this.getRotation() + " showed in classical mode.");
    }

}

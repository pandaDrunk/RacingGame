package car;

public class car_factory_Ferrari implements car_factory{
	 public car create_car() {

		 car_Ferrari Ferrari = new car_Ferrari();
		 Ferrari.setName("Ferrari F60");
		 Ferrari.setSpeed(300);

	        return Ferrari;

	 }
}

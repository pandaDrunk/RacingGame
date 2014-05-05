package car;

public class car_factory_Porsche implements car_factory{
	 public car create_car() {

		 car_Porsche Porsche = new car_Porsche();
		 Porsche.setName("Porsche 911");
		 Porsche.setSpeed(320);

	        return Porsche;

	 }
}

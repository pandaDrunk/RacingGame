package game;

import car.car_factory_Ferrari;
import car.car_factory;
import car.car;

import map.rainy;
import map.map_high;

import racing.dashboard_classic;
import racing.dashboard;

public class race {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			rainy map_rainy = new rainy();
			map_high map = new map_high(map_rainy);
	        map.create_map();

	        System.out.println();
	        
	        car_factory car_factory = new car_factory_Ferrari();
	        car car = car_factory.create_car();
	        car.start();
	        
	        System.out.println();
	        
	        dashboard dashboard_classic = new dashboard_classic();
	        dashboard_classic.setSpeed(300);
	        dashboard_classic.print_speed();
	        dashboard_classic.setRotation(6000);
	        dashboard_classic.print_rotation();

	        System.out.println();
	        
	        car.stop();
	}

}

package com.karthik.learnings;

public class FactoryPattern {

	public static void main(String args[]) {
		try {
			Vehicle v = VehicleFactory.getVehicle(2);
			System.out.println(v.getNoOfWheels());
		} catch (Exception e) {

		}
	}

}

interface Vehicle {

	String getNoOfWheels();

}

class TwoWheeler implements Vehicle {

	@Override
	public String getNoOfWheels() {
		return "Two";
	}

}

class FourWheeler implements Vehicle {

	@Override
	public String getNoOfWheels() {
		return "Four";
	}

}

class VehicleFactory {

	public static Vehicle getVehicle(Integer i) throws Exception {

		Vehicle veh;

		if (i == 2) {
			veh = new TwoWheeler();
		} else if (i == 4) {
			veh = new FourWheeler();
		} else {
			throw new Exception("Invalid Type");
		}
		return veh;
	}

}

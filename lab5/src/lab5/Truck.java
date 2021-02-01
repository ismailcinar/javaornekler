package lab5;

public class Truck extends Vehicle{
      private boolean isPickup;
	public Truck() {
		
	}
	
	public Truck(String brand, String model, int year, int noOfDoors, int noOfSeats, int noOfWheels, double cost,boolean isPickup) {
		super(brand, model, year, noOfDoors, noOfSeats, noOfWheels, cost);
		this.isPickup=isPickup;
	}

	public boolean getisPickup() {
		return isPickup;
	}
	public void setPickup(boolean isPickup) {
		this.isPickup = isPickup;
	}

	@Override
	public String toString() {
		return "Truck [getisPickup()=" + getisPickup() + ", getBrand()=" + getBrand() + ", getModel()=" + getModel()
				+ ", getYear()=" + getYear() + ", getNoOfSeats()=" + getNoOfSeats() + ", getNoOfWheels()="
				+ getNoOfWheels() + "]";
	}
	}


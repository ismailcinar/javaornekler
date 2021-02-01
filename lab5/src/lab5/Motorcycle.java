package lab5;

public class Motorcycle extends Vehicle {
     private boolean isOffRoad;
     
	public Motorcycle(String brand, String model, int year, int noOfDoors, int noOfSeats, int noOfWheels, double cost,boolean isOffRoad) {
		super(brand, model, year, noOfDoors, noOfSeats, noOfWheels, cost);
		this.isOffRoad=isOffRoad;
	}
	public Motorcycle() {
		
	}
	public boolean getisOffRoad() {
		return isOffRoad;
	}
	public void setOffRoad(boolean isOffRoad) {
		this.isOffRoad = isOffRoad;
	}
	@Override
	public String toString() {
		return "Motorcycle [isOffRoad()=" + getisOffRoad() + ", getBrand()=" + getBrand() + ", getModel()=" + getModel()
				+ ", getYear()=" + getYear() + ", getNoOfDoors()=" + getNoOfDoors() + ", getNoOfSeats()="
				+ getNoOfSeats() + ", getNoOfWheels()=" + getNoOfWheels() + ", getCost()=" + getCost() + "]";
	}

}

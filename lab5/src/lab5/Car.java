package lab5;

public class Car extends Vehicle{
	
	private boolean isSuv;
	public Car(String brand, String model, int year, int noOfDoors, int noOfSeats, int noOfWheels, double cost,boolean isSuv) {
		super(brand, model, year, noOfDoors, noOfSeats, noOfWheels, cost);
	this.setIsSuv(isSuv);
	}

	public Car(boolean isSuv) {
		
		this.setIsSuv(isSuv);
	}

	public Car () {
		
	}

	public boolean getIsSuv() {
		return isSuv;
	}

	public void setIsSuv(boolean isSuv) {
		this.isSuv = isSuv;
	}

	@Override
	public String toString() {
		return "Car [isSuv()=" + getIsSuv() + ", getBrand()=" + getBrand() + ", getModel()=" + getModel() + ", getYear()="
				+ getYear() + ", getNoOfDoors()=" + getNoOfDoors() + ", getNoOfSeats()=" + getNoOfSeats()
				+ ", getNoOfWheels()=" + getNoOfWheels() + ", getCost()=" + getCost() + "]";
	}

}


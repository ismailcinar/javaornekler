package lab5;

public class Vehicle {
	private String brand;
	private String model;
	private int year;
	private int noOfDoors;
	private int noOfSeats;
	private int noOfWheels;
	private double cost;
	
	
	
	
	public Vehicle() {
		
	}




	public Vehicle(String brand, String model, int year, int noOfDoors, int noOfSeats, int noOfWheels, double cost) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.noOfDoors = noOfDoors;
		this.noOfSeats = noOfSeats;
		this.noOfWheels = noOfWheels;
		this.cost = cost;
	}

	public String getBrand() {
		return brand;
	}




	public void setBrand(String brand) {
		this.brand = brand;
	}




	public String getModel() {
		return model;
	}




	public void setModel(String model) {
		this.model = model;
	}




	public int getYear() {
		return year;
	}




	public void setYear(int year) {
		this.year = year;
	}




	public int getNoOfDoors() {
		return noOfDoors;
	}




	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}




	public int getNoOfSeats() {
		return noOfSeats;
	}




	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}




	public int getNoOfWheels() {
		return noOfWheels;
	}




	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}




	public double getCost() {
		return cost;
	}




	public void setCost(double cost) {
		this.cost = cost;
	}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


package lab5;

import java.util.ArrayList;


public class AutoGallery {

	
	public AutoGallery() {
		
	}
private  ArrayList <Vehicle>vehicleList;
	
	public AutoGallery(ArrayList<Vehicle> vehicleList) {
		this.vehicleList=vehicleList;
	}
		
	public ArrayList<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void setvehicleList(ArrayList<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}
	public static void main(String[] args) {
		
		Car car= new Car("ar","ba",2,3,4,5,2.3,false);	
		Car car2= new Car("ar","baa",2,3,4,5,2.3,false);		
		
		ArrayList <Vehicle> cars = new ArrayList <Vehicle>();  
		cars.add (car);
        cars.add (car2); 
        
        AutoGallery autogallery = new AutoGallery (cars); 
     
        ArrayList<Vehicle> abc = autogallery.getVehicleList(); 
        for (Vehicle vv : abc)
{   
      System.out.println("Issuv : " + ((Car) vv).getIsSuv() +	"	Brand:"+	vv.getBrand()+"	Model : " + vv.getModel()+" 	Year : "+vv.getYear()+" getNoOfSeats : " + vv.getNoOfSeats() +	" getNoOfDoors : " + vv.getNoOfDoors() +	"	 getNoOfWheels:"+vv.getNoOfWheels()+"getCost :"+vv.getCost()); 
        } 
    	Truck truck= new Truck("honda","civic",2,3,4,5,2.3,false);	
		Truck truck2= new Truck("toyota","corolla",2,3,4,5,2.3,false);		
		
		ArrayList <Vehicle> trucks = new ArrayList <Vehicle>();  
		trucks.add (truck);
        trucks.add (truck2); 
        
        AutoGallery autogallery2 = new AutoGallery (trucks); 
     
        ArrayList<Vehicle> abc2 = autogallery2.getVehicleList(); 
        for (Vehicle vv : abc2)
{   
      System.out.println("IsPickup: " + ((Truck) vv).getisPickup() +	"	Brand:"+	vv.getBrand()+"	Model : " + vv.getModel()+" 	Year : "+vv.getYear()+" getNoOfSeats : " + vv.getNoOfSeats() +	" getNoOfDoors : " + vv.getNoOfDoors() +	"	 getNoOfWheels:"+vv.getNoOfWheels()+"getCost :"+vv.getCost()); 
        } 
       
}
	
	
}





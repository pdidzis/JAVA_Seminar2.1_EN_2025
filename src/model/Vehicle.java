package model;

public class Vehicle {
	
	//1.variables
	private long id;
	public String title;
	public String VehicleCode;
	public float price;
	public EnergyType eType;
	
	private static long counter = 10000;
	
	
	//2.getters
	
	public long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getVehicleCode() {
		return VehicleCode;
	}
	public float getPrice() {
		return price;
	}
	public EnergyType geteType() {
		return eType;
	}
	
	//3.setters
	
	public void setId() {
		id = counter;
		counter++;
	}
	
	
	
	
	
	
	
	
	

}

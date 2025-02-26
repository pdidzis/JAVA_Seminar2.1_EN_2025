package model;

public class Vehicle {
	
	//1.variables
	private long id;
	private String title;
	private String VehicleCode;
	private float price;
	private EnergyType eType;
	
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
	
	public void setTitle(String inputTitle) {
		if(inputTitle!= null && inputTitle.matches("[A-Za-z ]{3-20}")) {
			title = inputTitle;
			
		}
		else 
		{
			title = "No title";
		}
	}
	
	public void setVehicleCode() {
		VehicleCode = id + "_" + title; 
		
	}
	
	
	public void setPrice(float inputPrice) {
		if(inputPrice > 0 && inputPrice < 1000000) {
			price = inputPrice;
		}
		else 
		{
			price = 100;
		}
			
	}
	
	public void setEnergyType(EnergyType inputEnergyType) {
		if(inputEnergyType != null) {
			eType = inputEnergyType;
		}
		else 
		{
			eType = EnergyType.not_specified;
		}
	}
	
	
	//4.no arg. const.
	
	public Vehicle() {
		setId();
		setTitle("Test Vehicle");
		setPrice(1341);
		setVehicleCode();
		setEnergyType(EnergyType.other);
	}
	
	//5. arg const.
	
	public Vehicle(String inputTitle,float inputPrice,EnergyType inputEnergyType ) {
		setId();
		setTitle(inputTitle);
		setVehicleCode();
		setPrice(inputPrice);
		setEnergyType(inputEnergyType);
		
		
	}
	
	//6,to string
	public String toString()
	{
		return " Id : " + id + ", Title : " + title + ", Vehicle Code : " + VehicleCode + ", Price : " + price + ", EnergyType : " + eType;
	}
	
	
	
	
	
	
	
	
	

}

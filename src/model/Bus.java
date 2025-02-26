package model;

public class Bus extends Vehicle{
	
	//1.variables
	private int numberOfSeats;
	private boolean hasBaggageDivision;


	//2.getters
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public boolean isHasBaggageDivision() {
		return hasBaggageDivision;
	}
	
	//3. setters
	
	public void setNumberOfSeats(int inputNumberOfSeats) {
		if(inputNumberOfSeats > 0 && inputNumberOfSeats < 200) {
			numberOfSeats = inputNumberOfSeats;
		}
		else 
		{
			numberOfSeats = 20; 
		}
			
	}
	
	public void setHasBaggageDivision(boolean inputHasBaggageDivision) {
		hasBaggageDivision = inputHasBaggageDivision;
	}
	
	
	//4.default const
	
	public Bus() {
		super(); // it will call no argument const from Vehicle class
		setNumberOfSeats(10);
		setHasBaggageDivision(true);
	}
	
	public Bus(String inputTitle,float inputPrice,EnergyType inputEnergyType, int inputNumberOfSeats, boolean inputHasBaggageDivision) {
		super(inputTitle, inputPrice, inputEnergyType);
		setNumberOfSeats(inputNumberOfSeats);
		setHasBaggageDivision(inputHasBaggageDivision);
		
	}
	
	public String toString() {
		return super.toString() + ", NumberOfSeats : " + numberOfSeats + ", has baggage: " + hasBaggageDivision;
	}
	
	
	

}

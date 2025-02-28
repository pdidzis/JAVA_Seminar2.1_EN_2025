package model;

public class Bus extends Vehicle{
	// variables, getters, setters, both constructors, toString + other functions(if necessary)
	private  int numberOfSeats;
	private boolean hasBaggageDivision;
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public boolean isHasBaggageDivision() {
		return hasBaggageDivision;
	}
	
	public void setNumberOfSeats(int inputNumberOfSeats) {
		if(inputNumberOfSeats > 0 && inputNumberOfSeats < 200) {
			numberOfSeats = inputNumberOfSeats;
		}
		else
		{
			numberOfSeats = 20;
		}
	}
	
	public void setHasBaggageDivision(boolean inputHasBaggageDivision)
	{
		hasBaggageDivision = inputHasBaggageDivision;
	}
	
	
	public Bus() {
		super();//it will call no argument constructor from Vehicle
		setNumberOfSeats(10);
		setHasBaggageDivision(true);
	}
	
	public Bus(String inputTitle, float inputPrice, EnergyType inputEnergyType,
			int inputNumberOfSeats, boolean inputHasBaggageDivision) {
		super(inputTitle, inputPrice, inputEnergyType);//it will call argument constructor from Vehicle
		setNumberOfSeats(inputNumberOfSeats);
		setHasBaggageDivision(inputHasBaggageDivision);
		
	}

	public String toString() {
		return super.toString() + ", " + numberOfSeats + ", has baggage: " + hasBaggageDivision;
	}
	
	
}
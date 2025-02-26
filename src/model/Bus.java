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
	
	public void hasBaggageDivision(boolean inputHasBaggageDivision) {
		hasBaggageDivision = inputHasBaggageDivision;
	}
	
	
	
	

}

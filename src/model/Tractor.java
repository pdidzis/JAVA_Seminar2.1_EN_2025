package model;

public class Tractor extends Vehicle {
	//variables
	private String additionalTechniques;
	private boolean isOnlyLargeTires;
	
	//getters
	
	public String getAdditionalTechniques() {
		return additionalTechniques;
	}
	public boolean isOnlyLargeTires() {
		return isOnlyLargeTires;
	}

	//setters \
	
	public void setAdditionalTechniques(String inputAdditionalTechniques) {
		if (inputAdditionalTechniques != null) {
			additionalTechniques = inputAdditionalTechniques;
		}
		else 
		{
			additionalTechniques = "No Additional Techniques ";
		}
		
	}
	
	public void setIsOnlyLargeTires(boolean inputIsOnlyLargeTires) {
		isOnlyLargeTires = inputIsOnlyLargeTires;
	}
	
	//def constr
	
	public Tractor() {
		super();
		setAdditionalTechniques("Test Tech");
		setIsOnlyLargeTires(true);
		
	}
	
	//arg const.
	public Tractor(String inputTitle,float inputPrice,EnergyType inputEnergyType, String inputAdditionalTechniques,boolean inputIsOnlyLargeTires) {
		super(inputTitle, inputPrice, inputEnergyType);
		setAdditionalTechniques(inputAdditionalTechniques);
		setIsOnlyLargeTires(inputIsOnlyLargeTires);		
	}
	
	//toString 
	public String toString() {
		return super.toString() + ", AdditionalTechniques : " + additionalTechniques + ", has large tires: " + isOnlyLargeTires;
	}
	
	
	
	
	
	
}

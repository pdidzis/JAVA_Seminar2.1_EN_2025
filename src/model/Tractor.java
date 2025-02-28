package model;

public class Tractor extends Vehicle{
	// variables, getters, setters, both constructors, toString + other functions(if necessary)
	private String additionalTechniques;
	private boolean isOnlyLargeTires;
	public String getAdditionalTechniques() {
		return additionalTechniques;
	}
	public boolean isOnlyLargeTires() {
		return isOnlyLargeTires;
	}
	
	public void setAdditionalTechniques(String inputAdditionalTechniques) {
		if(inputAdditionalTechniques != null) {
			additionalTechniques = inputAdditionalTechniques;
		}
		else
		{
			additionalTechniques = "cultivator";
		}
	}
	
	public void setIsOnlyLargeTires(boolean inputIsOnlyLargeTires) {
		isOnlyLargeTires = inputIsOnlyLargeTires;
	}
	
	public Tractor() {
		super();
		setAdditionalTechniques("cultivator");
		setIsOnlyLargeTires(true);
	}
	

	public Tractor(String inputTitle, float inputPrice, EnergyType inputEnergyType,
			String inputAdditionalTechniques, boolean inputIsOnlyLargeTires ) {
		super(inputTitle, inputPrice, inputEnergyType);
		setAdditionalTechniques(inputAdditionalTechniques);
		setIsOnlyLargeTires(inputIsOnlyLargeTires);
	}
	
	public String toString() {
		return super.toString() + ", " + additionalTechniques 
				+ ", large tires->" + isOnlyLargeTires; 
	}
	
	
}
package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import service.MainService;

public class Purchase {
	// variables, getters, setters, both constructors, toString + other functions(if necessary)
	private String userCardNr;
	private ArrayList<Vehicle> shoppingList = new ArrayList<Vehicle>();
	private LocalDateTime dateTime;
	
	public String getUserCardNr() {
		return userCardNr;
	}
	public ArrayList<Vehicle> getShoppingList() {
		return shoppingList;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	
	public void setUserCardNr(String inputUserCardNr) {
		if(inputUserCardNr != null && inputUserCardNr.matches("[A-Z]{3}[0-9]{6}")) {
			userCardNr = inputUserCardNr;
		}
		else
		{
			userCardNr = "No card no";
		}
	}
	
	//no set for shoppinglist because it is initialized as empty list and adding some tractors or busses will be done in next functions

	public void setDateTime() {
		dateTime = LocalDateTime.now();
	}
	
	public Purchase()
	{
		setUserCardNr("ABC123456");
		setDateTime();
	}
	
	public Purchase(String inputUserCardNr) {
		setUserCardNr(inputUserCardNr);
		setDateTime();
	}
	
	public String toString() {
		return userCardNr + "bought " + shoppingList + " (" + dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE) + " " + dateTime.getHour() +  ":" +dateTime.getMinute() + ":" + dateTime.getSecond() + ")";
	}
	
	public void addVehicleToShoppingListByVehicleCode(String inputVehicleCode, int quantity) throws Exception {
		if(inputVehicleCode != null && quantity > 0 && quantity < 100) {
			for(Vehicle tempV: MainService.getAllVehicles())
			{
				if(tempV.getVehicleCode().equals(inputVehicleCode)) 
				{
					if (tempV.getQuantity() >= quantity) 
				
					{
						for(int i = 0; i < quantity; i++) {
							shoppingList.add(tempV);
							
						}
					
						tempV.setQuantity(tempV.getQuantity() - quantity);
						
					} 
				}
			}
			
		}
		else 
		{
			throw new Exception ("Code param should be not null and quantity should be 1 - 10");
		}
		
	}
	
	public void removeVehicleFromShoppingListByVehicleCode(String inputVehicleCode) throws Exception {
		if(inputVehicleCode != null) 
		{
			for(Vehicle tempV : shoppingList) {
				if(tempV.getVehicleCode().equals(inputVehicleCode)) {
					for(Vehicle tempVV : MainService.getAllVehicles()) {
						if(tempVV.getVehicleCode().equals(inputVehicleCode)) {
							shoppingList.remove(tempV);
							tempVV.setQuantity(tempVV.getQuantity()+1);
							
						}
						
					}
				}
			}
			
		}
		else 
		{
			throw new Exception ("Code param should be not null");
		}
		
	}
	
	public float calculateShoppingListValue() throws Exception {
		if(shoppingList.isEmpty()) 
		{
			throw new Exception("Shopping list is empty");
		}
		float sum = 0;
		
		for(Vehicle tempV : shoppingList) {
			sum = sum +tempV.getPrice();
		}
		
		
		
		
		return sum;
		
		
	}
	
	
	
	
	
	
}
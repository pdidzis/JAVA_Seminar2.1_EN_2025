package service;

import java.util.ArrayList;
import java.util.Arrays;

import model.Bus;
import model.EnergyType;
import model.Purchase;
import model.Tractor;
import model.Vehicle;

public class MainService {
	private static ArrayList<Vehicle> allVehicles = new ArrayList<Vehicle>();
	private static ArrayList<Purchase> allPurchases = new ArrayList<Purchase>();

	public static void main(String[] args) {
		Bus v1 = new Bus();
		Bus v2 = new Bus("Large bus", 1000.99f, EnergyType.electric, 100, true, 3);
		
		Tractor v3 = new Tractor();
		Tractor v4 = new Tractor("Small tractor", 567.99f, 
				EnergyType.diesel, "with cultivator", true, 5);
		
		allVehicles.addAll(Arrays.asList(v1, v2, v3, v4));
		
		System.out.println(allVehicles);
		
		Purchase p1 = new Purchase();
		Purchase p2 = new Purchase("AAA123456");
		//p2.getShoppingList().addAll(Arrays.asList(v2, v4));
		//allPurchases.addAll(Arrays.asList(p1, p2));
		System.out.println("-------------------PURCHASE TESTING-------------------");
		try {
			p2.addVehicleToShoppingListByVehicleCode("0_Test Vehicle", 1);
			p2.addVehicleToShoppingListByVehicleCode("3_Small tractor", 2);
			System.out.println("Shopping list: " + p2.getShoppingList());
			System.out.println("Price of the shopping list: " + p2.calculateShoppingListValue() + " eur");
			System.out.println("All vehicles at the moment: " +allVehicles);
			
			p2.removeVehicleFromShoppingListByVehicleCode("3_Small tractor");
			System.out.println("Shopping list (without one small tractor): " + p2.getShoppingList());
			System.out.println("Price of the shopping list(without one small tractor): " + p2.calculateShoppingListValue() + " eur");
			System.out.println("All vehicles at the moment: " +allVehicles);
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(allPurchases);
		

	}

	public static ArrayList<Vehicle> getAllVehicles() {
		return allVehicles;
	}

	
}
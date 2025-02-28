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
		Bus v2 = new Bus("Large bus", 1000.99f, EnergyType.electric, 100, true);
		
		Tractor v3 = new Tractor();
		Tractor v4 = new Tractor("Small tractor", 567.99f, EnergyType.diesel, "With cultivator", true);
		
		allVehicles.addAll(Arrays.asList(v1, v2, v3, v4));
		
		System.out.println(allVehicles);
		
		Purchase p1 = new Purchase();
		Purchase p2 = new Purchase("AAA123456");
		p2.getShoppingList().addAll(Arrays.asList(v2, v4));
		allPurchases.addAll(Arrays.asList(p1, p2));
		System.out.println(allPurchases);
		
		
		
			
	}

	public static ArrayList<Vehicle> getAllVehicles() {
		return allVehicles;
	}
	
	
	
	
	
}

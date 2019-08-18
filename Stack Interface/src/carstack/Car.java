package carstack;

import java.util.Scanner;

public class Car {
	Scanner input = new Scanner(System.in);
	
	private String model, regNum, status;
	
	public Car(String model, String regNum) {
		
		createCar(model, regNum);
		
	}
	
	public void createCar(String model, String regNum) {
		this.model = model;
		this.regNum = regNum;
		this.status = "Ready to drive";
		
		System.out.println(model + " car created wiht reg number " + regNum);
		
	}
	
	public void crashCar() {
		this.status = "Damaged";
		System.out.println("The car has been in an accident.");
	}
	
	public void repairCar() {
		this.status = "Ready to Drive";
		System.out.println("Car has being repaired.");
	}
}

import java.util.Scanner;
public class PlantDriver{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String common, botanical, zone, light, price, availability = "";
		String[] userInputs = new String[6];
		FileUtility util = new FileUtility("../data/plant.txt");
		Plant plant = new Plant();
		String[] lsOfPlants = plant.plantProcessor(util);
		plant.displayPlants(lsOfPlants);
		plant.q1(lsOfPlants);
		plant.q2(lsOfPlants);
		plant.q3(lsOfPlants);


		/*
		
		System.out.println("Enter plant common name:");
		common = scan.nextLine();
		System.out.println("Enter plant botanical name:");
		botanical = scan.nextLine();
		System.out.println("Enter plant zone:");
		zone = scan.nextLine();
		System.out.println("Enter plant light requirement:");
		light = scan.nextLine();
		System.out.println("Enter plant price:");
		price = scan.nextLine();
		System.out.println("Enter plant availability:");
		availability = scan.nextLine();
		userInputs[0] = common;
		userInputs[1] = botanical;
		userInputs[2] = zone;
		userInputs[3] = light;
		userInputs[4] = price;
		userInputs[5] = availability;
		plant.addNewPlant(userInputs, util);


		System.out.println("Enter plant to be deleted:");
		String plantToBeDeleted = scan.nextLine();
		plant.deletePlant(plantToBeDeleted, util);

		

		System.out.println("Enter plant to be updated:");
		String plantToBeUpdated = scan.nextLine();
		System.out.println("Enter new plant common name:");
		common = scan.nextLine();
		System.out.println("Enter new plant botanical name:");
		botanical = scan.nextLine();
		System.out.println("Enter new plant zone:");
		zone = scan.nextLine();
		System.out.println("Enter new plant light requirement:");
		light = scan.nextLine();
		System.out.println("Enter new plant price:");
		price = scan.nextLine();
		System.out.println("Enter new plant availability:");
		availability = scan.nextLine();
		userInputs[0] = common;
		userInputs[1] = botanical;
		userInputs[2] = zone;
		userInputs[3] = light;
		userInputs[4] = price;
		userInputs[5] = availability;
		plant.updatePlant(plantToBeUpdated, userInputs, util);
		
		*/

		
		
	}
}